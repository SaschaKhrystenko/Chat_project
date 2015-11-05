package myTwiterProject.entities;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by ua001022 on 29.05.2015.
 */
public class Message {
    private String login;
    private Timestamp date;
    private String message;

    public Message(String login, Timestamp date, String message) {
        this.login = login;
        this.date = date;
        this.message = message;
    }

    public String getLogin() {
        return login;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }


}
