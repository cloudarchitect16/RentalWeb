package com.rental.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView sayHello(){
        ModelMap model = new ModelMap();
        model.addAttribute("message", "Welcome to Rental Cars System!!");
        return new ModelAndView("home", model);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin(){
        ModelMap model = new ModelMap();
        model.addAttribute("message", "Login");
        return new ModelAndView("login", model);
    }

}

