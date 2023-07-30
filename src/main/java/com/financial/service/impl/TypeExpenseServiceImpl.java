package com.financial.service.impl;

import com.financial.RequestDTO.TypeExpenseDTO;
import com.financial.mapper.TypeExpenseMapper;
import com.financial.repository.TypeExpenseRepository;
import com.financial.service.TypeExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class TypeExpenseServiceImpl implements TypeExpenseService {




    private final TypeExpenseRepository typeExpenseRepository;

    @Autowired
    private TypeExpenseMapper typeExpenseMapper;

    public TypeExpenseServiceImpl(TypeExpenseRepository typeExpenseRepository) {
        this.typeExpenseRepository = typeExpenseRepository;
    }

	 @Override
    public Mono<Object> saveTypeExpense(TypeExpenseDTO typeExpenseDTO){
        return typeExpenseRepository.findByTypeExpense(typeExpenseDTO.typeExpense().toUpperCase())
                .flatMap(existingTypeExpense -> Mono.error(new ExistTypeExpenseException("TYPE OF EXPENSE ALREADY EXISTS")))
                .switchIfEmpty(typeExpenseRepository.save(typeExpenseMapper.toEntity(typeExpenseDTO)));
    }

   /* @Override
    public void updateTypeExpense(TypeExpenseDTO typeExpenseDTO) {
        Optional<TypeExpenseModel> typeExpenseModel =
                typeExpenseRepository.findByTypeExpense(typeExpenseDTO.getTypeExpense().toUpperCase());


    }*/


}
