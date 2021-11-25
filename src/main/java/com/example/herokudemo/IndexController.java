package com.example.herokudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "https://laurab22.github.io/Proyecto-Ingenieria-Web/Home.html")

public class IndexController {
    @GetMapping("/")

    public String index() {
        return "Hola mundo.";
    }
}
