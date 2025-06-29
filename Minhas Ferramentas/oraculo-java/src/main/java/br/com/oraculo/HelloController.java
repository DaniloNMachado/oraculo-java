package br.com.oraculo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá! Bem-vindo ao servidor do Oráculo!";
    }
}