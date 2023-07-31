package com.financial.RequestDTO;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeExpenseDTO {

    @NotNull(message = "TypeExpense can't be null")
    String typeExpense;

    String obs;
}