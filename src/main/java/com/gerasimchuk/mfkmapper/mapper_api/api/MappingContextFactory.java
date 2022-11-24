package com.gerasimchuk.mfkmapper.mapper_api.api;

import java.util.List;

public interface MappingContextFactory {
    <F, T> List<MappingContext<F, T>> get(Class<F> fromClass, Class<T> toClass);
}
