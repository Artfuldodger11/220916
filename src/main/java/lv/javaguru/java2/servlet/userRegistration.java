package lv.javaguru.java2.servlet;

import lv.javaguru.java2.domain.User;
import lv.javaguru.java2.database.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class userRegistration extends HttpServlet {
    private UserDAO userDAO = null;
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {


        try {
            User user = new User();
            String newFirstName = req.getParameter("RegFirstName");
            String newLastName = req.getParameter("RegLastName");
            String newEmail = req.getParameter("RegEmail");
            String newLogin = req.getParameter("RegLogin");
            String newPassword = req.getParameter("RegPassword");
            user.setFirstName(newFirstName);
            user.setLastName(newLastName);
            user.setEmail(newEmail);
            user.setLogin(newLogin);
            user.setPassword(newPassword);
            userDAO.create(user);

    }

    catch (Exception e) {}

}


}