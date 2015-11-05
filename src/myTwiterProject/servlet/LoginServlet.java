package myTwiterProject.servlet;

import myTwiterProject.DAO.LoginDAO;
import myTwiterProject.entities.Account;
import myTwiterProject.managers.AuthManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by ua001022 on 08.06.2015.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("account-name");
        String password = req.getParameter("account-password");

        AuthManager myManager = new AuthManager();
        Account myAccount = myManager.authenticate(login,password);

        if(myAccount!=null){
            HttpSession mySession = req.getSession();
            mySession.setAttribute("authorized",true);
            mySession.setAttribute("login",myAccount.getLogin());
            mySession.setAttribute("id",myAccount.getId());
            req.getRequestDispatcher("/user-page.jsp").include(req,resp);

            return;
        }
        else {
            req.setAttribute("error",true);
            req.getRequestDispatcher("/login-page.jsp").include(req,resp);
        }





    }
}
