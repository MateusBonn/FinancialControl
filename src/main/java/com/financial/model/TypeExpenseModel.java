package com.financial.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;


@Document
@Data
@Builder
public class TypeExpenseModel implements Serializable{

    @Id
    private String typeExpenseId;

    @Indexed(unique = true)
    private String typeExpense;

    private String obs;

}
