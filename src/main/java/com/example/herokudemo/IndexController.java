package com.example.herokudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")

public class IndexController {
    @GetMapping("/")

    public String index() {
        return "Hola mundo.";
    }
}
