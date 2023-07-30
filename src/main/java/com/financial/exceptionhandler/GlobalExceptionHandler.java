package com.financial.exceptionhandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        if ("CPF já cadastrado".equals(ex.getMessage())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CPF já cadastrado no sistema.");
        } else {
            // Trate outras exceções aqui, se necessário.
            // Você pode retornar um ResponseEntity com outro status HTTP e mensagem personalizada.
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno no servidor.");
        }
    }
}

