package com.financial.FinancialControl.service.impl;

import com.financial.FinancialControl.RequestDTO.SaveLoginDTO;
import com.financial.FinancialControl.mapper.LoginMapper;
import com.financial.FinancialControl.model.LoginModel;
import com.financial.FinancialControl.repository.LoginRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;



import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class LoginServiceImplTest {
    @Mock
    private LoginRepository loginRepository;

    @Mock
    private LoginMapper loginMapper;

    @InjectMocks
    private LoginServiceImpl loginService;


    @Test
    void saveLogin() {
        SaveLoginDTO request = new SaveLoginDTO("031.260.940-07",
                                                "Mateus Bonn Ferreira",
                                                LocalDate.of(1993, 7, 11),
                                                "mateusbonn@user.com",
                                                "mbonn",
                                                "senha");
        LoginModel entity = LoginModel.builder().build();

        when(loginMapper.toEntity(any(SaveLoginDTO.class))).thenReturn(entity);
        when(loginRepository.save(any(LoginModel.class))).thenReturn(Mono.just(LoginModel.builder().build()));

    }
}
