/*
package com.financial.model;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class SpentModel {

    @Id
    private UUID spentId;


    private String spentName;

    private double value;

    private boolean installment;

    private String reason;

    @ManyToOne
    @JoinColumn(name = "type_expense_id", nullable = false)
    private TypeExpenseModel typeExpense;
}
*/
