package com.ejemplo.primermicroservicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerMicroservicioController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola, desde mi primer microservicio!";
    }
}
