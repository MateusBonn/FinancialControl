package com.financial.FinancialControl.service;

import com.financial.FinancialControl.RequestDTO.TypeExpenseDTO;
import reactor.core.publisher.Mono;


public interface TypeExpenseService {

     Mono<Object> saveTypeExpense(TypeExpenseDTO typeExpenseDTO) ;
  /*  void updateTypeExpense(TypeExpenseDTO typeExpenseDTO);*/

}
