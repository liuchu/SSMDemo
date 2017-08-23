package controller;

import model.FullName;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Created by chuliu on 2017/7/25.
 * dd
 */
@Controller
public class IndexController{

    //get log4j handler
    private static final Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView Index(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("logger:"+logger);
        logger.info("Going to run HelloLoggingController class");
        logger.info("Requesting /index");
        ModelAndView mav = new ModelAndView("redirect:/name");

        return mav;
    }

    @RequestMapping("/name")
    public ModelAndView Name(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        logger.info("Requesting /name");
        ModelAndView mav = new ModelAndView("input_name");
        return mav;
    }

    @RequestMapping("/submitName")
    public ModelAndView submitName(FullName fullName) throws Exception {
        //System.out.println("First name: "+fullName.getFirstName()+" | Last name:"+fullName.getLastName());

        logger.info("Requesting /submitName");
        ModelAndView mav = new ModelAndView("show_full_name");
        return mav;
    }

    @RequestMapping("/wrongName")
    public ModelAndView wrongName() throws Exception {

        logger.info("Requesting /wrongName");
        ModelAndView mav = new ModelAndView("wrong_name");
        return mav;
    }

    @RequestMapping("/count")
    public ModelAndView count(HttpSession session) throws Exception{
        logger.info("Requesting /count");
        Integer i = (Integer) session.getAttribute("number");
        if (i == null)
            i = 0;
        i++;
        session.setAttribute("number", i);
        ModelAndView mav = new ModelAndView("count");
        return mav;
    }
}
