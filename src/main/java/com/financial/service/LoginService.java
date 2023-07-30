package com.financial.service;

import com.financial.RequestDTO.SaveLoginDTO;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public interface LoginService {
    Mono<Object> saveLogin(SaveLoginDTO saveLoginDTO);
}
