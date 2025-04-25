package com.desafio.pagamentosapi.domain;

import java.util.Arrays;
import java.util.Optional;

public enum StatusPagamento {
    PENDENTE_PROCESSAMENTO("pendente_processamento"),
    PROCESSADO_COM_SUCESSO("processado_sucesso"),
    PROCESSADO_COM_FALHA("processado_com_falha"),
    INATIVO("inativo");

    final String nome;

    StatusPagamento(String nome) {
        this.nome = nome;
    }

    static Optional<StatusPagamento> findByNome(String nome){
        return Arrays.stream(values()).filter( status -> nome.equals(status.nome)).findFirst();
    }
}
