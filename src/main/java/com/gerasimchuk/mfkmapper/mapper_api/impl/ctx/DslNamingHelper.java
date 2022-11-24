package com.gerasimchuk.mfkmapper.mapper_api.impl.ctx;

import com.gerasimchuk.mfkmapper.mapper_api.api.MappingContext;
import com.gerasimchuk.mfkmapper.mapper_api.impl.rules.base_pojo_dto_base_pojo_entity.MapFirstStringFieldUppercased;
import com.gerasimchuk.mfkmapper.mapper_api.impl.rules.base_pojo_dto_base_pojo_entity.MapInnerList;
import com.gerasimchuk.mfkmapper.mapper_api.impl.rules.base_pojo_dto_base_pojo_entity.MapSecondStringFieldLowercased;
import com.gerasimchuk.mfkmapper.dto_samples.BasePojoDto;
import com.gerasimchuk.mfkmapper.entity_samples.BasePojoEntity;

public interface DslNamingHelper extends MappingContext<BasePojoDto, BasePojoEntity> {

    default MappingContext<BasePojoDto, BasePojoEntity> transformWithUpperCase() {
        return withRule(new MapFirstStringFieldUppercased());
    }

    default MappingContext<BasePojoDto, BasePojoEntity> transformWithLowerCase() {
        return withRule(new MapSecondStringFieldLowercased());
    }

    default MappingContext<BasePojoDto, BasePojoEntity> mapInnerList() {
        return withRule(new MapInnerList());
    }

}
