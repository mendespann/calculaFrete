package br.com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.api.model.ClienteCEP;
import br.com.example.api.service.ConsultaCEPService;

@RestController
public class ConsultaCEPController {

    @Autowired
    private ConsultaCEPService consultaCEPService;

    @GetMapping("/consulta-cep/{cep}")
    public ClienteCEP consultaCep(@PathVariable("cep") String cep) {
        return consultaCEPService.consultaCep(cep);
    }
}
