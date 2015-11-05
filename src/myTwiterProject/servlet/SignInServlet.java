package myTwiterProject.servlet;

import myTwiterProject.managers.RegistrationManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ua001022 on 08.06.2015.
 */
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("account-name");
        String password = req.getParameter("account-password");

        RegistrationManager manager = new RegistrationManager();

        if(manager.register(login,password)){
            req.setAttribute("success", true);
            req.setAttribute("error", null);
            req.getRequestDispatcher("/sign-page.jsp").include(req, resp);
        }

        req.setAttribute("error", true);
        req.getRequestDispatcher("/sign-page.jsp").include(req, resp);
    }
}
