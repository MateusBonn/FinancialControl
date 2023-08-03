package com.financial.FinancialControl.service;

import com.financial.FinancialControl.RequestDTO.SaveLoginDTO;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public interface LoginService {
    Mono<Object> saveLogin(SaveLoginDTO saveLoginDTO);
}
