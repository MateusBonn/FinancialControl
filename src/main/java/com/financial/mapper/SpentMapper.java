package com.financial.mapper;


import com.financial.RequestDTO.SpentDTO;
import com.financial.model.SpentModel;
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
public interface SpentMapper {

    @Mapping(target = "spentId", ignore = true)
    SpentModel toEntity(final SpentDTO spentDTO);

    @Mapping(target = "spentId", ignore = true)
    SpentModel toEntity(final SpentDTO spentDTO, @MappingTarget final SpentModel entity);
}
