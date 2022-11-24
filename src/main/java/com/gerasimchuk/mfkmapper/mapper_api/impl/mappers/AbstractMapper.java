package com.gerasimchuk.mfkmapper.mapper_api.impl.mappers;

import com.gerasimchuk.mfkmapper.mapper_api.api.Mapper;

import java.util.function.Supplier;

public abstract class AbstractMapper<FROM, TO> implements Mapper<FROM, TO> {

    private final Supplier<TO> resultInstanceSupplier;

    protected AbstractMapper(Supplier<TO> resultInstanceSupplier) {
        this.resultInstanceSupplier = resultInstanceSupplier;
    }

    @Override
    public Supplier<TO> resultInstanceSupplier() {
        return resultInstanceSupplier;
    }

}
