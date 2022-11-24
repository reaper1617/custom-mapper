package com.gerasimchuk.mfkmapper.mapper_api.api;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface MappingRule<POJO_FROM, POJO_TO> {
    BiConsumer<POJO_FROM, POJO_TO> mapper();
}

