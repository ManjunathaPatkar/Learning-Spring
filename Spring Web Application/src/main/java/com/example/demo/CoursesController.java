package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CoursesController {
    @RequestMapping("/courses")
    public ModelAndView courses(@RequestParam("cname")String coursename) {
//        HttpSession session=request.getSession();
//        String cname=request.getParameter("cname");
        //System.out.println("Welcome to Web APP"+cname);
//        session.setAttribute("cname", coursename);
        ModelAndView mv = new ModelAndView();
        mv.addObject("cname",coursename);
        mv.setViewName("course");
        return mv;
    }
}
