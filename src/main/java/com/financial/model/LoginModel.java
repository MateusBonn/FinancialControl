package com.financial.model;


import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.relational.core.mapping.Table;


@Getter
@Setter
@Table("TB_LOGIN")
@Builder
public class LoginModel implements Serializable {

    private String cpf;

    private String fullName;

    private LocalDate dateBirth;

    private String email;

    private String user;

    private String password;
}
