package com.financial.mapper;

import com.financial.RequestDTO.SaveLoginDTO;
import com.financial.model.LoginModel;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;


@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = IGNORE,
        nullValueCheckStrategy = ALWAYS
)
public interface LoginMapper {

    LoginModel toEntity(final SaveLoginDTO saveLoginDTO);
    LoginModel toEntity(final SaveLoginDTO saveLoginDTO, @MappingTarget final LoginModel entity);

   /* UserResponse toResponse(final LoginModel loginModel);*/
}
