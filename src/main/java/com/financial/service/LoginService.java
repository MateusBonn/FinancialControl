package com.financial.service;

import com.financial.RequestDTO.SaveLoginDTO;
import org.springframework.stereotype.Component;

@Component
public interface LoginService {
    void saveLogin(SaveLoginDTO saveLoginDTO);
}
