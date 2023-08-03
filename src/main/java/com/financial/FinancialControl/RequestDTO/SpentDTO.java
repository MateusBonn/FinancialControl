package com.financial.FinancialControl.RequestDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpentDTO {

    @NotBlank(message = "Spend name can't be null")
    private String spentName;

    @NotNull(message = "Spend value can't be null")
    private double value;

    @NotNull(message = "Installment can't be null")
    private boolean installment;
    private String reason;

    @NotNull(message = "Type expense can't be null")
    private Long typeExpenseId;

}