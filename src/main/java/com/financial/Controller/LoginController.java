package com.financial.Controller;



import com.financial.RequestDTO.SaveLoginDTO;
import com.financial.service.LoginService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    /*
     * Inserir login
     */
    @PostMapping("/save")
    public ResponseEntity<Object> saveLogin(@RequestBody @Valid SaveLoginDTO saveLoginDTO) {

        loginService.saveLogin(saveLoginDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Login criado com sucesso!");
    }
}
