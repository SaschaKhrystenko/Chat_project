package myTwiterProject.servlet;

import myTwiterProject.entities.Message;
import myTwiterProject.managers.MessageManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ua001022 on 08.06.2015.
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Integer id = (Integer)req.getSession().getAttribute("id");
        String login = (String) req.getSession().getAttribute("login");

        String url = req.getRequestURI();

        String userName = url.substring(url.lastIndexOf("/")+1).toString();

       if(userName.equals(login)){
           req.getSession().setAttribute("homepage",true);
       }
        else {
           req.getSession().setAttribute("homepage",false);
           req.getSession().setAttribute("following",true);
       }

        req.getRequestDispatcher("/user-page").include(req,resp);

    }
}
