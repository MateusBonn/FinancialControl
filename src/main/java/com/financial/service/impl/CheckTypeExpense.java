package com.financial.service.impl;

import com.financial.RequestDTO.TypeExpenseDTO;
import com.financial.exceptionhandler.MessageExceptionHandler;
import com.financial.model.TypeExpenseModel;
import com.financial.repository.TypeExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Optional;

@Component
public class CheckTypeExpense {

    @Autowired
    TypeExpenseRepository typeExpenseRepository;

    @ResponseBody
    @ExceptionHandler
    public void verifyTypeExpenseDatabase(TypeExpenseDTO typeExpenseDTO){
        Optional<TypeExpenseModel> typeExpenseExist =
                typeExpenseRepository.findByTypeExpense(typeExpenseDTO.getTypeExpense());
        if (!typeExpenseExist.isEmpty()){
            throw new MessageExceptionHandler(new Date(),"TYPE OF EXPENSE ALREADY EXISTS");
        }

    }


}
