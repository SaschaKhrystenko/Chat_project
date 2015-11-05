package myTwiterProject.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ua001022 on 08.06.2015.
 */
public class RegDAO extends BaseDAO{

    public void register (String login, String password){
        Connection connection = getConnection();

        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO accounts" + "(login, password) VALUES" + "(?, ?)");

            ps.setString(1, login);
            ps.setString(2, password);
            ps.executeUpdate();

            ps.close();
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isUnique(String account) {
        List<String> result = new ArrayList<String>();
        Connection c = getConnection();
        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT login FROM accounts");

            while (rs.next()) {
                String login = rs.getString("login");
                result.add(login);
            }
            rs.close();
            s.close();
            c.close();

            for(String login : result) {
                if (login.equals(account)) {
                    return false;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}
