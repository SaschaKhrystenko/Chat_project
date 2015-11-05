package myTwiterProject.managers;

import myTwiterProject.DAO.RegDAO;

/**
 * Created by ua001022 on 08.06.2015.
 */
public class RegistrationManager {
public boolean register (String login, String password){

    RegDAO regDAO = new RegDAO();

    if(regDAO.isUnique(login)){
        regDAO.register(login,password);
        return true;
    }
    return false;
}
}
