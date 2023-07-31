package com.financial.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;


@Document("TB_SPENT")
@Data
@Builder
public class SpentModel implements Serializable {

    @Id
    private String spentId;

    private String spentName;

    private double value;

    private boolean installment;

    private String reason;

    private String typeExpenseId;
}

