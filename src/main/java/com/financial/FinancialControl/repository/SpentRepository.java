package com.financial.FinancialControl.repository;

import com.financial.FinancialControl.model.SpentModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@Repository
public interface SpentRepository extends ReactiveCrudRepository<SpentModel, Long> {

    Mono<SpentModel> findBySpentName(String spentName);
}

