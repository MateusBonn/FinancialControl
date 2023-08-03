package com.financial.FinancialControl.repository;

import com.financial.FinancialControl.model.TypeExpenseModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface TypeExpenseRepository extends ReactiveCrudRepository<TypeExpenseModel, Long> {

    Mono<TypeExpenseModel> findByTypeExpense(String typeExpense);
    Mono<TypeExpenseModel> findByTypeExpenseId(Long typeExpenseId);

}
