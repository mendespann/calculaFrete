package br.com.example.api.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import br.com.example.api.model.ClienteCEP;

@Service
public class ConsultaCEPService {
 @GetMapping("{cep}")
    public ClienteCEP consultaCep(@PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ClienteCEP> resp = restTemplate.getForEntity(
                    String.format("https://viacep.com.br/ws/%s/json", cep),
                    ClienteCEP.class);
        ClienteCEP cliente = resp.getBody();
        double frete = cliente.calcularFrete(cliente.getUf());
        cliente.setFrete(frete);                        
        return cliente;                        
    }}