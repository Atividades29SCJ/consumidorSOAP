package br.com.fiap.teste;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rodrigo {

    @RequestMapping(method = RequestMethod.GET, value = "/fiap")
    public String teste() {
        return "Teste";
    }
}
