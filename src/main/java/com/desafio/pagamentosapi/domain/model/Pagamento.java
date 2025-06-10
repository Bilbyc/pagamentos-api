package com.desafio.pagamentosapi.domain.model;

import com.desafio.pagamentosapi.domain.enums.StatusPagamento;
import com.desafio.pagamentosapi.domain.enums.TipoMetodoPagamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
