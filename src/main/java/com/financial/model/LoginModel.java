package com.financial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "TB_USERS")
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginModel implements Serializable {

    @Id
    private String cpf;

    @Column(nullable = false, unique = true, length = 20)
    private String nomeCompleto;

    @Column(nullable = false, unique = true, length = 10)
    private LocalDate dataNasc;

    @Column(nullable = false, unique = true, length = 10)
    private String email;

    @Column(nullable = false, unique = true, length = 10)
    private String user;

    @Column(nullable = false, unique = true, length = 12)
    private String senha;
}
