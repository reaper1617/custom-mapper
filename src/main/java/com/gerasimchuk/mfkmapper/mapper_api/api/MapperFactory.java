package com.gerasimchuk.mfkmapper.mapper_api.api;

public interface MapperFactory {
    <F,T> Mapper<F,T> get(Class<F> classFrom, Class<T> classTo);
}
