package com.financial.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "TB_SPENT")
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID spentId;

    @Column(nullable = false, unique = true)
    private String spentName;

    @Column(nullable = false, unique = true)
    private double value;

    @Column(nullable = false)
    private boolean installment;

    @Column
    private String reason;

    @ManyToOne
    @JoinColumn(name = "type_expense_id", nullable = false)
    private TypeExpenseModel typeExpense;
}
