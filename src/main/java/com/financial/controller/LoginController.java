package com.financial.controller;

import com.financial.RequestDTO.SaveLoginDTO;
import com.financial.service.LoginService;
import com.financial.exceptionhandler.ExceptionHandled;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    /*
     * Inserir login
     */
    @PostMapping("/save")
    public Mono<ResponseEntity<String>> saveLogin(@RequestBody @Valid SaveLoginDTO saveLoginDTO) {
        log.info(String.valueOf(saveLoginDTO));
        return loginService.saveLogin(saveLoginDTO)
                .then(Mono.just(ResponseEntity.status(HttpStatus.CREATED).body("Login criado com sucesso!")))
                .onErrorResume(ExceptionHandled.class, e -> Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao criar o login: " + e.getMessage())))
                .switchIfEmpty(Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao criar o login.")));
    }
}
