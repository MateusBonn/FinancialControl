package com.financial.service;

import com.financial.RequestDTO.TypeExpenseDTO;
import reactor.core.publisher.Mono;


public interface TypeExpenseService {

     Mono<Object> saveTypeExpense(TypeExpenseDTO typeExpenseDTO) ;
  /*  void updateTypeExpense(TypeExpenseDTO typeExpenseDTO);*/

}
