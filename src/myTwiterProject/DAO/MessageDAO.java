package myTwiterProject.DAO;

import myTwiterProject.entities.Message;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ua001022 on 28.05.2015.
 */
public class MessageDAO extends BaseDAO {



  public  List<Message> getAllMessages (){

      List<Message>allMessages = new ArrayList<Message>();
      Connection myConnection = getConnection();

      try {



          java.sql.Statement statement = myConnection.createStatement();
         // ResultSet resultSet = statement.executeQuery("SELECT login, date_at, message FROM messages,accounts WHERE messages.user_id=accounts.id ORDER BY date_at DESC ");
          ResultSet resultSet = statement.executeQuery("SELECT accounts.login,messages.date_at,messages.message FROM messages JOIN accounts ON messages.user_id = accounts.id ORDER BY date_at DESC ");


          while ((resultSet.next())){
            String login = resultSet.getString("login");
              String message = resultSet.getString("message");
             Timestamp date = resultSet.getTimestamp("date_at");
                Message myMessage = new Message(login,date,message);

              allMessages.add(myMessage);
          }
          resultSet.close();
          statement.close();
          myConnection.close();
      } catch (Exception e) {
              e.printStackTrace();
      }
      finally {
          try {
              myConnection.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
      return allMessages;
  }

    public void addMessage(Integer id, String message){
        Connection con = getConnection();
        try {
            PreparedStatement prStat = con.prepareStatement("INSERT INTO messages (user_id,date_at,message) VALUES (?,?,?)");

            prStat.setInt(1, id);
            prStat.setTimestamp(2, new Timestamp(new java.util.Date().getTime()));
            System.out.println(new Timestamp(new java.util.Date().getTime()));
            prStat.setString(3, message);
            prStat.executeUpdate();

            prStat.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
