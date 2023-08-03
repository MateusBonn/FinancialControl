package com.financial.FinancialControl.mapper;

import com.financial.FinancialControl.RequestDTO.TypeExpenseDTO;
import com.financial.FinancialControl.model.TypeExpenseModel;
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
public interface TypeExpenseMapper {

    @Mapping(target = "typeExpenseId", ignore = true)
    TypeExpenseModel toEntity(final TypeExpenseDTO typeExpenseDTO);

    @Mapping(target = "typeExpenseId", ignore = true)
    TypeExpenseModel toEntity(final TypeExpenseDTO typeExpenseDTO, @MappingTarget final TypeExpenseModel typeExpenseModel);
}

