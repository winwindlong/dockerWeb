package com.test.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhang on 2018/12/29.
 */
@Controller
public class IndexController {
    @RequestMapping(value = {"/","/index.html","/login"})
    public ModelAndView loginPage(HttpServletRequest request, Model model){
        ModelAndView mav = new ModelAndView("index");

        return mav;
    }
}
