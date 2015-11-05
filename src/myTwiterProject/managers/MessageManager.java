package myTwiterProject.managers;

import myTwiterProject.DAO.MessageDAO;
import myTwiterProject.entities.Message;

import java.util.List;

/**
 * Created by ua001022 on 29.05.2015.
 */
public class MessageManager {

    public List<Message> getAllMessages(){
        List<Message> allMessages;
    MessageDAO messageDAO = new MessageDAO();
    allMessages = messageDAO.getAllMessages();

    return allMessages;
    }

    public static void addMessage (Integer id, String message){
        MessageDAO msgDAO = new MessageDAO();
        msgDAO.addMessage(id, message);
    }

}
