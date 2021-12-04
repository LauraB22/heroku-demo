package com.example.herokudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")

public class IndexController {
    @GetMapping("/")

    public String index() {
        return "Hola mundo.";
    }

    @GetMapping("/datos")

    public List<Integer> index2() {
        List<Integer> lista = new ArrayList<Integer>() ;
        lista.add(5);
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);


        return lista;
    }

}
