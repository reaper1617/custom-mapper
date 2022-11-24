package com.gerasimchuk.mfkmapper.mapper_api.impl;

import com.gerasimchuk.mfkmapper.mapper_api.api.Mapper;
import com.gerasimchuk.mfkmapper.mapper_api.api.MapperFactory;
import com.gerasimchuk.mfkmapper.mapper_api.impl.mappers.BaseDtoToEntityMapper;
import com.gerasimchuk.mfkmapper.dto_samples.BasePojoDto;
import com.gerasimchuk.mfkmapper.entity_samples.BasePojoEntity;

public class MapperFactoryDummyImpl implements MapperFactory {
    @Override
    public <F, T> Mapper<F, T> get(Class<F> classFrom, Class<T> classTo) {

        if (classFrom == BasePojoDto.class && classTo == BasePojoEntity.class){
            return (Mapper<F,T>)new BaseDtoToEntityMapper();
        }
        throw new IllegalArgumentException("Mapper not found");
    }
}
