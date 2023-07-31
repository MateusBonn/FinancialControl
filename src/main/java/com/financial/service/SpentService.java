package com.financial.service;

import com.financial.RequestDTO.SpentDTO;
import reactor.core.publisher.Mono;

public interface SpentService {

   Mono<Object> saveSpent(SpentDTO spentDTO) ;
}

