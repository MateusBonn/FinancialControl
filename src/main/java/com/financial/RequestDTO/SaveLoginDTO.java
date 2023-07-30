package com.financial.RequestDTO;

import java.time.LocalDate;

public record SaveLoginDTO (
        String cpf,
        String nomeCompleto,
        LocalDate dataNasc,
        String email,
        String user,
        String senha
) { }
