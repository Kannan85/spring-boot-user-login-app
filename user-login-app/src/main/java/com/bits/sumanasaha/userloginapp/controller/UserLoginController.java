package com.bits.sumanasaha.userloginapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserLoginController {

    @RequestMapping( "/")
    public String loginSuccess(){
        return "success.html";
    }

    @RequestMapping("/signIn.html")
    public String signIn(){
        return "signIn.html";
    }

    @RequestMapping("/signIn-error.html")
    public String signInError( Model model ){
        model.addAttribute( "loginError", true );
        return "signIn.html";
    }
}
