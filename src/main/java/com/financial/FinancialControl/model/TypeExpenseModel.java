package com.financial.FinancialControl.model;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;


@Getter
@Setter
@Table("TB_TYPE_EXPENSE")
@Builder
public class TypeExpenseModel implements Serializable{

    private Long typeExpenseId;

    private String typeExpense;

    private String obs;

}
