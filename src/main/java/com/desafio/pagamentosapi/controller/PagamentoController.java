package com.desafio.pagamentosapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pagamento")
public class PagamentoController {

    @GetMapping("/listar")
    public String listaTodos(){
        return "Retorno bem sucedido";
    }
}
