package com.desafio.pagamentosapi.controller;

import com.desafio.pagamentosapi.domain.dtos.PagamentoDto;
import com.desafio.pagamentosapi.domain.model.Pagamento;
import com.desafio.pagamentosapi.service.PagamentoService;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pagamento")
public class PagamentoController {

    PagamentoService pagamentoService;

    PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @GetMapping("/listar")
    public String listaTodos(){
        return "Retorno bem sucedido";
    }

    @PostMapping(value = "/criar")
    public void criarPagamento(@Valid @RequestBody PagamentoDto pagamento){
        pagamentoService.CriarPagamento(pagamento);
    }
}
