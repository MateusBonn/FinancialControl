package com.financial.service.impl;

import com.financial.RequestDTO.SaveLoginDTO;
import com.financial.model.LoginModel;
import com.financial.repository.LoginRepository;
import com.financial.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    final LoginRepository loginRepository;

    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Autowired
    CheckLogin verify;

    @Override
    public void saveLogin(SaveLoginDTO saveLoginDTO) {

        // IMPLEMENTAR VERIFICAÇOES SE EXISTE NA TABELA
        verify.verifyDatabase(saveLoginDTO);

        var loginModel = new LoginModel();
        BeanUtils.copyProperties(saveLoginDTO, loginModel);
        loginRepository.save(loginModel);
    }
}
