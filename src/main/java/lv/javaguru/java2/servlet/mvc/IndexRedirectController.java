package lv.javaguru.java2.servlet.mvc;

import javax.servlet.http.HttpServletRequest;

public class IndexRedirectController implements MVCController{

    public MVCModel execute(HttpServletRequest request) {


       MVCModel mvcModel = null;
        /*
       try {
            String buttonStateFromIndex = request.getParameter("redirect");
            if (buttonStateFromIndex != null) {
                if (buttonStateFromIndex == "Registration") {
                    return new MVCModel(null, "/views/RegisterPage.jsp");
                } else if (buttonStateFromIndex == "SignIn") {
                    return new MVCModel(null, "/views/SignInPage.jsp");
                } else {
                    return new MVCModel(null, "/views/index.jsp");
                }
            }


        } catch (Exception e) {

        } */
        return mvcModel;
    }
}
