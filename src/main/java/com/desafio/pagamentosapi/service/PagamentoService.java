package com.desafio.pagamentosapi.service;

import com.desafio.pagamentosapi.domain.dtos.PagamentoDto;
import com.desafio.pagamentosapi.domain.model.Pagamento;
import com.desafio.pagamentosapi.repository.PagamentoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    PagamentoRepository pagamentoRepository;

    PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    };


    public void CriarPagamento(PagamentoDto pagamentoDto) {
        Pagamento pagamento = new Pagamento();
        BeanUtils.copyProperties(pagamentoDto, pagamento);

        pagamentoRepository.save(pagamento);
    }

}
