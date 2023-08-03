package com.financial.FinancialControl.service.impl;

import com.financial.FinancialControl.RequestDTO.SaveLoginDTO;
import com.financial.FinancialControl.exceptionhandler.ExceptionHandled;
import com.financial.FinancialControl.mapper.LoginMapper;
import com.financial.FinancialControl.repository.LoginRepository;
import com.financial.FinancialControl.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    private  LoginMapper loginMapper;


    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public Mono<Object> saveLogin(SaveLoginDTO loginDTO) {
        return loginRepository.findByCpf(loginDTO.getCpf())
                .flatMap(existingLogin -> Mono.error(new ExceptionHandled("CPF ALREADY EXIST")))
                .switchIfEmpty(loginRepository.save(loginMapper.toEntity(loginDTO)));
    }


}
