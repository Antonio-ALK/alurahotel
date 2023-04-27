package com.alura.hotel.one.control;

import com.alura.hotel.one.model.Huesped;
import com.alura.hotel.one.model.Login;
import com.alura.hotel.one.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginControl {
    @Autowired
    private LoginService loginService;

    @GetMapping ("/login")
    public String login(Login login){
        return "login";
    }
    @GetMapping ("/registroLogin")
    public String registroLogin(Login login){
        return "guardarLogin";
    }



    @GetMapping("/buscarLogin")
    @Transactional(readOnly = true)
    public String buscarLogin( Login login){
        return  "reservasLoginOk";
    }

    @PostMapping("/guardarLogin")
    @Transactional
    public String guardarLogin(Login login){
       loginService.agregarLogin(login);
        return "login";
    }



}