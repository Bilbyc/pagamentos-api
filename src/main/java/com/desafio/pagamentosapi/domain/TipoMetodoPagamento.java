package com.desafio.pagamentosapi.domain;

import java.util.Arrays;
import java.util.Optional;

public enum TipoMetodoPagamento {
    BOLETO("boleto"),
    PIX("pix"),
    CARTAO_CREDITO("cartao_credito"),
    CARTAO_DEBITO("cartao_debito");

    private final String nome;

    TipoMetodoPagamento(String nome) {
        this.nome = nome;
    }

    static Optional<TipoMetodoPagamento> findByNome(String nome){
        return Arrays.stream(values()).filter(status -> nome.equals(status.nome)).findFirst();
    }
}
