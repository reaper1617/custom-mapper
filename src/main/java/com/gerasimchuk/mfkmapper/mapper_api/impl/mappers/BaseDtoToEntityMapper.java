package com.gerasimchuk.mfkmapper.mapper_api.impl.mappers;

import com.gerasimchuk.mfkmapper.dto_samples.BasePojoDto;
import com.gerasimchuk.mfkmapper.entity_samples.BasePojoEntity;

public class BaseDtoToEntityMapper extends AbstractMapper<BasePojoDto, BasePojoEntity> {

    public BaseDtoToEntityMapper() {
        super(BasePojoEntity::new);
    }

}
