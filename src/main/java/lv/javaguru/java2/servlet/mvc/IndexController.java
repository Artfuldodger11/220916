package lv.javaguru.java2.servlet.mvc;

import javax.servlet.http.HttpServletRequest;

public class IndexController implements MVCController{

    public MVCModel execute(HttpServletRequest request){

            return new MVCModel(null, "/views/index.jsp");

   }
}
