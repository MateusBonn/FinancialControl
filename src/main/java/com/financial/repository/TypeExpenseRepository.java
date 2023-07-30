package com.financial.repository;

import com.financial.RequestDTO.TypeExpenseDTO;
import com.financial.model.TypeExpenseModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface TypeExpenseRepository extends ReactiveCrudRepository<TypeExpenseModel, UUID> {

    Mono<TypeExpenseDTO> findByTypeExpense(String typeExpense);
}
