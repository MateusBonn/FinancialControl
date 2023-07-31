package com.financial.service.impl;

import com.financial.RequestDTO.SaveLoginDTO;
import com.financial.exceptionhandler.ExceptionHandled;
import com.financial.mapper.LoginMapper;
import com.financial.repository.LoginRepository;
import com.financial.service.LoginService;
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
