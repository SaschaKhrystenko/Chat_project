package myTwiterProject.servlet;

import myTwiterProject.DAO.MessageDAO;
import myTwiterProject.managers.MessageManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ua001022 on 08.06.2015.
 */
public class MessageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = (Integer) req.getSession().getAttribute("id");
        String login = (String)req.getSession().getAttribute("login");
        String message = req.getParameter("send-message");

       MessageManager.addMessage(id,message);

       req.getRequestDispatcher("/user-page.jsp").include(req,resp);

    }
}
