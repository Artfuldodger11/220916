package lv.javaguru.java2.servlet.mvc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@Component

public class IndexController implements MVCController {

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public MVCModel processRequest(HttpServletRequest request) {

        if (request.getParameter("RedirectToRegisterPage") != null) {
            return new MVCModel("model", "/views/RegisterPage.jsp");
        }

        if (request.getParameter("RedirectToSignInPage") != null) {
            return new MVCModel("model", "/views/SignInPage.jsp");
        }

        return new MVCModel("model", "/views/index.jsp");
    }



}


