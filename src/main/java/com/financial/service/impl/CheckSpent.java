package com.financial.service.impl;

import com.financial.RequestDTO.SpentDTO;
import com.financial.exceptionhandler.MessageExceptionHandler;
import com.financial.model.SpentModel;
import com.financial.repository.SpentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Optional;

public class CheckSpent {

    @Autowired
    SpentRepository spentRepository;

    public void verifySpent(SpentDTO spentDTO){
        Optional<SpentModel> spentNameExist =
                spentRepository.findBySpentName(spentDTO.getSpentName());
        if (!spentNameExist.isEmpty()){
            throw new MessageExceptionHandler(new Date(),"TYPE OF EXPENSE ALREADY EXISTS");
        }

    }
}
