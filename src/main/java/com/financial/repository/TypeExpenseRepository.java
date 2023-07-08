package com.financial.repository;

import com.financial.model.TypeExpenseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TypeExpenseRepository extends JpaRepository<TypeExpenseModel, UUID> {

    Optional<TypeExpenseModel> findByTypeExpense(String typeExpense);
}
