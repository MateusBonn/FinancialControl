package com.financial.Controller;


import com.financial.RequestDTO.TypeExpenseDTO;
import com.financial.service.TypeExpenseService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/type-expense")
public class TypeExpenseController {

    @Autowired
    TypeExpenseService typeExpenseService;



    @PostMapping("/save")
    public ResponseEntity<Object> saveTypeExpense(@RequestBody @Valid TypeExpenseDTO typeExpenseDTO) {

        typeExpenseService.saveTypeExpense(typeExpenseDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Type of expense recorded");
    }

    @GetMapping("/body")
    public ResponseEntity<Object> getBody(){
        TypeExpenseDTO typeExpenseDTO = new TypeExpenseDTO();
        return ResponseEntity.status(HttpStatus.OK).body(typeExpenseDTO);
    }
}
