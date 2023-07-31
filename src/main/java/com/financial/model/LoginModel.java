package com.financial.model;


import lombok.*;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.time.LocalDate;


@Document("TB_LOGIN")
@Data
@Builder
public class LoginModel implements Serializable {

    @Id
    private String cpf;

    private String fullName;

    private LocalDate dateBirth;

    private String email;

    private String user;

    private String password;
}
