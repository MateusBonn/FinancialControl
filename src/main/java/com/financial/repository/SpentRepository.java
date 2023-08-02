package com.financial.repository;

import com.financial.model.SpentModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;


@Repository
public interface SpentRepository extends ReactiveCrudRepository<SpentModel, Long> {

    Mono<SpentModel> findBySpentName(String spentName);
}

