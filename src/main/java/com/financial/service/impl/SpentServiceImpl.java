/*
package com.financial.service.impl;

import com.financial.RequestDTO.SpentDTO;
import com.financial.model.SpentModel;
import com.financial.repository.SpentRepository;
import com.financial.service.SpentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class SpentServiceImpl implements SpentService {

    @Autowired
    SpentRepository spentRepository;

    @Autowired
    CheckSpent checkSpent;

    @Override
    public void saveSpent(SpentDTO spentDTO) {
        spentDTO.setSpentName(spentDTO.getSpentName().toUpperCase());
        checkSpent.verifySpent(spentDTO);

        var spendingModel = new SpentModel();
        BeanUtils.copyProperties(spentDTO, spendingModel);
        spentRepository.save(spendingModel);
    }
}
*/
