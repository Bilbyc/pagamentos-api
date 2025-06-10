package com.desafio.pagamentosapi.domain.dtos;

import com.desafio.pagamentosapi.domain.enums.TipoMetodoPagamento;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PagamentoDto {
    private Integer codigoDebito;
    private String cpfOuCpnj;
    private TipoMetodoPagamento metodoPagamento;
    private String numeroCartao;
    private BigDecimal valor;
}
