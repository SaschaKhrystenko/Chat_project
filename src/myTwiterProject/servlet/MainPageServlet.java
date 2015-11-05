package myTwiterProject.servlet;

import myTwiterProject.managers.MessageManager;
import myTwiterProject.entities.Message;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ua001022 on 26.05.2015.
 */
public class MainPageServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MessageManager messageManager = new MessageManager();
        List<Message> allMessages = messageManager.getAllMessages();


        req.setAttribute("message", allMessages);

       // req.getRequestDispatcher("/result.jsp").include(req,resp);


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);

    }
}
