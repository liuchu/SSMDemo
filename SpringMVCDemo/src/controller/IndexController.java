package controller;

import model.FullName;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Created by chuliu on 2017/7/25.
 */
@Controller
public class IndexController{

    @RequestMapping("/index")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mav = new ModelAndView("redirect:/name");
        return mav;
    }

    @RequestMapping("/name")
    public ModelAndView Name(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mav = new ModelAndView("input_name");
        return mav;
    }

    @RequestMapping("/submitName")
    public ModelAndView submitName(FullName fullName) throws Exception {
        //System.out.println("First name: "+fullName.getFirstName()+" | Last name:"+fullName.getLastName());
        ModelAndView mav = new ModelAndView("show_full_name");
        return mav;
    }

    @RequestMapping("/count")
    public ModelAndView count(HttpSession session) throws Exception{
        Integer i = (Integer) session.getAttribute("number");
        if (i == null)
            i = 0;
        i++;
        session.setAttribute("number", i);
        ModelAndView mav = new ModelAndView("count");
        return mav;
    }
}
