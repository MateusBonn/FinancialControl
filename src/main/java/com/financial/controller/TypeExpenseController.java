package com.financial.controller;


import com.financial.RequestDTO.TypeExpenseDTO;
import com.financial.service.TypeExpenseService;
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
@RequestMapping("/type-expense")
public class TypeExpenseController {

    @Autowired
    TypeExpenseService typeExpenseService;



    @PostMapping("/save")
   public Mono<ResponseEntity<String>> saveTypeExpense(@RequestBody @Valid TypeExpenseDTO typeExpenseDTO) {
        typeExpenseDTO.setTypeExpense(typeExpenseDTO.getTypeExpense().toUpperCase());
        return typeExpenseService.saveTypeExpense(typeExpenseDTO)
                .then(Mono.just(ResponseEntity.status(HttpStatus.CREATED).body("Tipo de gasto salvo com sucesso!")))
                .onErrorResume(ExceptionHandled.class, e -> Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao salvar Tipo de gasto: " + e.getMessage())))
                .switchIfEmpty(Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao salvar Tipo de gasto.")));
    }
 /*   @GetMapping("/body")
    public ResponseEntity<Object> getBody(){
        TypeExpenseDTO typeExpenseDTO = new TypeExpenseDTO();
        return ResponseEntity.status(HttpStatus.OK).body(typeExpenseDTO);
    }*/
}
