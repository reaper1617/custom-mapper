package com.gerasimchuk.mfkmapper.mapper_api.impl.rules.base_pojo_dto_base_pojo_entity;

import com.gerasimchuk.mfkmapper.mapper_api.api.MappingRule;
import com.gerasimchuk.mfkmapper.dto_samples.BasePojoDto;
import com.gerasimchuk.mfkmapper.entity_samples.BasePojoEntity;

import java.util.Locale;
import java.util.function.BiConsumer;

public class MapFirstStringFieldUppercased implements MappingRule<BasePojoDto, BasePojoEntity> {
    @Override
    public BiConsumer<BasePojoDto, BasePojoEntity> mapper() {
        return (dto, entity) -> entity.setFirstStringField(dto.getStringField().toUpperCase(Locale.ROOT));
    }
}
