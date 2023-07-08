package com.financial.RequestDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SaveLoginDTO {

    @CPF
    @NotNull(message = "CPF não pode ser nula")
    private String cpf;

    @NotBlank(message = "Nome não pode ser nula")
    private String nomeCompleto;

    @NotNull(message = "Data de nascimento não pode ser nula")
    private LocalDate dataNasc;

    @Email
    @NotNull(message = "E-mail não pode ser nula")
    private String email;

    @NotBlank(message = "Usuário não pode ser nula")
    private String user;

    @NotNull(message = "Senha não pode ser nula")
    private String senha;

}
