package com.financial.repository;

import com.financial.model.SpentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SpentRepository extends JpaRepository<SpentModel, UUID> {

    Optional<SpentModel> findBySpentName(String spentName);
}
