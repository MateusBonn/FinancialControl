package com.financial.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_TYPE_EXPENSE")
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeExpenseModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID typeExpenseId;

    @Column(nullable = false, unique = true)
    private String typeExpense;

    @Column (nullable = false, unique = false)
    private String obs;

    @OneToMany(mappedBy = "typeExpense")
    private List<SpentModel> spents;
}
