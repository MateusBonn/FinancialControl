package com.financial.FinancialControl.service.impl;

import com.financial.FinancialControl.RequestDTO.SpentDTO;
import com.financial.FinancialControl.exceptionhandler.ExceptionHandled;
import com.financial.FinancialControl.mapper.SpentMapper;
import com.financial.FinancialControl.repository.SpentRepository;
import com.financial.FinancialControl.service.SpentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SpentServiceImpl implements SpentService {

    @Autowired
    SpentRepository spentRepository;

    @Autowired
    SpentMapper spentMapper;


    @Override
    public Mono<Object> saveSpent(SpentDTO spentDTO) {
        return spentRepository.findBySpentName(spentDTO.getSpentName())
                .flatMap(existingSpent -> Mono.error(new ExceptionHandled("Spent already exist")))
                .switchIfEmpty(spentRepository.save(spentMapper.toEntity(spentDTO)));

    }
}

