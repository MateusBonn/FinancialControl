package com.financial.repository;

import com.financial.model.LoginModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;



public interface LoginRepository extends ReactiveCrudRepository<LoginModel,String> {

    Mono<LoginModel> findByCpf(String cpf);

}
