package lv.javaguru.java2.servlet.mvc;


import lv.javaguru.java2.database.DBException;
import lv.javaguru.java2.database.UserDAO;
import lv.javaguru.java2.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SignInController implements MVCController {

    @Autowired
    @Qualifier ("ORM_UserDAO")
    private UserDAO userDAO;

    @RequestMapping ( value = "signIn", method = RequestMethod.POST)
    public MVCModel processRequest(HttpServletRequest request)  {

        try {
        String loginSignIn = request.getParameter("SignLogin");
        String passwordSignIn = request.getParameter("SignPassword");

        User user = null;
        user = userDAO.getByLogin(loginSignIn);

        if (user == null) {

            return new MVCModel("Login or password is wrong", "/views/SignInPage.jsp");
        }

        if (user.getPassword().equals(passwordSignIn)) {

            request.getSession().setAttribute("User", user);
            String loginOnPage = user.getLogin().toString();

            return new MVCModel( loginOnPage , "/views/WebTesterPage.jsp");

        } else {

            return new MVCModel("Login or password is wrong", "/views/SignInPage.jsp");

        } } catch (Exception e) {
        System.out.println(e);
    }

        return new MVCModel("SIGN IN Successful", "/views/WebTesterPage.jsp");
    }

}
