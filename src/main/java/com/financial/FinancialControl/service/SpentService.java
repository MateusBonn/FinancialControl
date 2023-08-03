package com.financial.FinancialControl.service;

import com.financial.FinancialControl.RequestDTO.SpentDTO;
import reactor.core.publisher.Mono;

public interface SpentService {

   Mono<Object> saveSpent(SpentDTO spentDTO) ;
}

