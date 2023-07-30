import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
package com.financial.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(MessageExceptionHandler.class)
    public ResponseEntity<Object> handleMessageException(MessageExceptionHandler ex) {

        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
*/
@ControllerAdvice
public class ExistTypeExpenseException {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        if ("TypeExpense já cadastrado".equals(ex.getMessage())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("TypeExpense já cadastrado no sistema.");
        } else {
            // Trate outras exceções aqui, se necessário.
            // Você pode retornar um ResponseEntity com outro status HTTP e mensagem personalizada.
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno no servidor.");
        }
    }
}
