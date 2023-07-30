package com.financial.repository;

import com.financial.RequestDTO.SaveLoginDTO;
import com.financial.model.LoginModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
public interface LoginRepository extends ReactiveCrudRepository<LoginModel,String> {

    Mono<SaveLoginDTO> findByCpf(String cpf);

}
