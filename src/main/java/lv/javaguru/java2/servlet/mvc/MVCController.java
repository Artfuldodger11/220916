package lv.javaguru.java2.servlet.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public interface MVCController {

    MVCModel processRequest(HttpServletRequest request);

}
