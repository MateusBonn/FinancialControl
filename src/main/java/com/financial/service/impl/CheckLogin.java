package com.financial.service.impl;

import com.financial.RequestDTO.SaveLoginDTO;
import com.financial.model.LoginModel;
import com.financial.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CheckLogin {

    @Autowired
    LoginRepository loginRepository;

    public void verifyDatabase(SaveLoginDTO saveLoginDTO){
        Optional<LoginModel> loginExist =  loginRepository.findById(saveLoginDTO.getCpf());
        if (!loginExist.isEmpty()){
            throw new Error("CPF ALREADY EXISTS");
        }

    }
}
