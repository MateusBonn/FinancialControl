package com.financial.FinancialControl.model;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;


@Getter
@Setter
@Table("TB_SPENT")
@Builder
public class SpentModel implements Serializable {

    private Long spentId;

    private String spentName;

    private double value;

    private boolean installment;

    private String reason;

    private Long typeExpenseId;
}

