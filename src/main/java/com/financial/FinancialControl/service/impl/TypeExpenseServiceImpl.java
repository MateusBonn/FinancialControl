package com.financial.FinancialControl.service.impl;

import com.financial.FinancialControl.RequestDTO.TypeExpenseDTO;
import com.financial.FinancialControl.exceptionhandler.ExceptionHandled;
import com.financial.FinancialControl.mapper.TypeExpenseMapper;
import com.financial.FinancialControl.repository.TypeExpenseRepository;
import com.financial.FinancialControl.service.TypeExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TypeExpenseServiceImpl implements TypeExpenseService {



    @Autowired
    private TypeExpenseRepository typeExpenseRepository;

    @Autowired
    private TypeExpenseMapper typeExpenseMapper;



	 @Override
    public Mono<Object> saveTypeExpense(TypeExpenseDTO typeExpenseDTO){
        return typeExpenseRepository.findByTypeExpense(typeExpenseDTO.getTypeExpense())
                .flatMap(existingTypeExpense -> Mono.error(new ExceptionHandled("TYPE EXPENSE ALREADY EXIST")))
                .switchIfEmpty(typeExpenseRepository.save(typeExpenseMapper.toEntity(typeExpenseDTO)));
    }

   /* @Override
    public void updateTypeExpense(TypeExpenseDTO typeExpenseDTO) {
        Optional<TypeExpenseModel> typeExpenseModel =
                typeExpenseRepository.findByTypeExpense(typeExpenseDTO.getTypeExpense().toUpperCase());


    }*/


}
