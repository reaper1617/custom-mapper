package com.gerasimchuk.mfkmapper.mapper_api.impl;

import com.gerasimchuk.mfkmapper.mapper_api.api.MappingContextFactory;
import com.gerasimchuk.mfkmapper.mapper_api.api.MappingContext;
import com.gerasimchuk.mfkmapper.mapper_api.impl.ctx.BasePojoToBaseDtoDslHelper;
import com.gerasimchuk.mfkmapper.dto_samples.BasePojoDto;
import com.gerasimchuk.mfkmapper.entity_samples.BasePojoEntity;
import java.util.Collections;

import java.util.List;

public class MapperContextFactoryDummyImpl implements MappingContextFactory {

    private final BasePojoToBaseDtoDslHelper entity = new BasePojoToBaseDtoDslHelper();

    @Override
    public <F, T> List<MappingContext<F, T>> get(Class<F> fromClass, Class<T> toClass) {
        if (fromClass == BasePojoDto.class && toClass == BasePojoEntity.class) {
            return getDummyConfigExample();
        }
        return Collections.emptyList();
    }

    private <F, T> List<MappingContext<F, T>> getDummyConfigExample() {
        return List.of(
                (BaseMappingContext<F, T>) new BaseMappingContext<BasePojoDto, BasePojoEntity>()
                        .withRule(entity.transformWithUpperCase())
                        .withRule(entity.transformWithLowerCase())
                        .withRule(entity.mapInnerList())
                        .withUniqueName("Example map context")
                        .build()
        );
    }
}
