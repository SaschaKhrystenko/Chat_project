package myTwiterProject.managers;

import myTwiterProject.DAO.LoginDAO;
import myTwiterProject.entities.Account;

/**
 * Created by ua001022 on 08.06.2015.
 */
public class AuthManager {

    public Account authenticate (String login, String password){
        LoginDAO myDAO = new LoginDAO();
        int id = myDAO.authenticate(login,password);

        if(id!=0){
            Account myAccount = new Account(id,login,password);
            return myAccount;
        }
        return null;
    }


}
