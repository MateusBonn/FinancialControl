package com.financial.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;


@Getter
@Setter
@Table("TB_TYPE_EXPENSE")
@Builder
public class TypeExpenseModel implements Serializable{

    private Long typeExpenseId;

    private String typeExpense;

    private String obs;

}
