package com.financial.RequestDTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class SaveLoginDTO {

        @NotNull(message = "CPF can't be null")
        String cpf;

        @NotNull(message = "Name can't be null")
        String fullName;

        @NotNull(message = "Date Birth can't be null")
        LocalDate dateBirth;

        @NotNull(message = "E-mail can't be null")
        String email;

        @NotNull(message = "User can't be null")
        String user;

        @NotNull(message = "Password can't be null")
        String password;
}
