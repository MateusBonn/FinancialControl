package com.financial.controller;


import com.financial.RequestDTO.SpentDTO;
import com.financial.exceptionhandler.ExceptionHandled;
import com.financial.service.SpentService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/spending")
public class SpentController {

    @Autowired
    SpentService spentService;

    @PostMapping("/save")
    public Mono<ResponseEntity<String>> saveSpent(@RequestBody @Valid SpentDTO spentDTO) {
        spentDTO.setSpentName(spentDTO.getSpentName().toUpperCase());
        return spentService.saveSpent(spentDTO)
                .then(Mono.just(ResponseEntity.status(HttpStatus.CREATED).body("Gasto salvo com sucesso!")))
                .onErrorResume(ExceptionHandled.class, e -> Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao salvar gasto: " + e.getMessage())))
                .switchIfEmpty(Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao salvar gasto.")));
    }
}