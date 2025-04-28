package com.desafio.pagamentosapi.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private int codigoDebito;
    @Column(nullable = false)
    private String cpfOuCpnj;
    @Column(nullable = false)
    private TipoMetodoPagamento metodoPagamento;
    @Column(nullable = false)
    private BigDecimal valor;
    @Enumerated(EnumType.STRING)
    private StatusPagamento status = StatusPagamento.PENDENTE_PROCESSAMENTO;
}
