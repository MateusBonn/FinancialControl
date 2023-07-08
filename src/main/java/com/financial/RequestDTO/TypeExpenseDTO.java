package com.financial.RequestDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TypeExpenseDTO {

    @NotBlank(message = "Spend type can't be null")
    private String typeExpense;

    @NotBlank(message = "The observation field can't be null")
    private String obs;
}
