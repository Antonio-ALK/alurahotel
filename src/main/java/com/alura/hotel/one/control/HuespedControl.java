package com.alura.hotel.one.control;

import com.alura.hotel.one.model.Huesped;
import com.alura.hotel.one.service.HuespedService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Controller

public class HuespedControl {
    @Autowired
    private HuespedService huespedService;



    @GetMapping ("/registro")
    public String registro(Huesped huesped){
        return "registro";
    }


    @GetMapping("/mostrar")
    @Transactional(readOnly = true)
    public String mostrarHuespedes(Model model){
        var huespedes = huespedService.listarHuesped();
        model.addAttribute("huespedes",huespedes);
        return "mostrarHuespedes";
    }

    @GetMapping("/back")
    public String back(){
        return "index";
    }
    @GetMapping("/guardarLogin")
    public String guardarLogin(){
        return "guardarLogin";
    }

    @PostMapping("/guardarHuesped")
    @Transactional
    public String guardarHuesped(Huesped huesped){
        huespedService.agregarHuesped(huesped);
        return "mostrarHuespedes";
    }



}
