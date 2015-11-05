package myTwiterProject.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by ua001022 on 08.06.2015.
 */
public class LoginDAO extends BaseDAO{

    public int authenticate (String login, String password){
        int result = 0;
        Connection con = getConnection();
        try{
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id FROM accounts WHERE login='"+login+"' AND password='"+password+"'" );

            while (resultSet.next()){
                result = resultSet.getInt("id");
                return result;
            }
            resultSet.close();
            statement.close();
            con.close();
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
        return result;
    }
}
