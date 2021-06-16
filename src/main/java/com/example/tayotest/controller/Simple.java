package com.example.tayotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author talabiomotayo on 6/11/21
 */
@Controller
public class Simple {


    @SuppressWarnings("all")
    @RequestMapping(value = "/homer", method = RequestMethod.GET)
    public String myHome(ModelMap model, HttpServletRequest httpServletRequest) {

        System.out.println("+++++++++++++++++");
        return "home";

    }

    @GetMapping("/login")
    public String login(ModelMap model, @RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout) {
        if (error != null) {
            model.addAttribute("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addAttribute("msg", "You've been logged out successfully.");
        }
        return "loginView";
    }
}
