package com.financial.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.time.LocalDate;


@Document
@Data
@Builder
public class LoginModel implements Serializable {

    @Id
    private String cpf;

    private String nomeCompleto;


    private LocalDate dataNasc;

    private String email;

    private String user;

    private String senha;
}
