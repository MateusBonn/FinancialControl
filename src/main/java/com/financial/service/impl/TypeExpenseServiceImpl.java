package com.financial.service.impl;

import com.financial.RequestDTO.TypeExpenseDTO;
import com.financial.model.TypeExpenseModel;
import com.financial.repository.TypeExpenseRepository;
import com.financial.service.TypeExpenseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeExpenseServiceImpl implements TypeExpenseService {

    @Autowired
    CheckTypeExpense checkTypeExpense;

    @Autowired
    TypeExpenseRepository typeExpenseRepository;

    @Override
    public void saveTypeExpense(TypeExpenseDTO typeExpenseDTO) {
        typeExpenseDTO.setTypeExpense(typeExpenseDTO.getTypeExpense().toUpperCase());
        checkTypeExpense.verifyTypeExpenseDatabase(typeExpenseDTO);

        var typeExpenseModel = new TypeExpenseModel();
        BeanUtils.copyProperties(typeExpenseDTO, typeExpenseModel);
        typeExpenseRepository.save(typeExpenseModel);
    }


}
