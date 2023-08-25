package com.example.lab1gticzz.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping(value = "/principal")
    public String login() {
        return "principal";
    }

    @GetMapping("/principal/{code}")
    public String code(
                           @PathVariable("code") String code
                          ) {
        System.out.println("nombre recibido: " + code);

        return "principal2";
    }
}