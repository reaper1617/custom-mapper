package com.gerasimchuk.mfkmapper.mapper_api.api;

import java.util.function.Supplier;

public interface Mapper<FROM, TO> {
    Supplier<TO> resultInstanceSupplier();

    default TO map(FROM from, MappingContext<FROM, TO> mappingContext) {
        if (resultInstanceSupplier() == null){
            throw new IllegalArgumentException("Result instance supplier must not be null");
        }
        TO resultInstance = resultInstanceSupplier().get();
        if (resultInstance == null){
            throw new IllegalArgumentException("Could not obtain result instance");
        }
        mappingContext.getAllRules().forEach(r -> r.mapper().accept(from, resultInstance));
        return resultInstance;
    }

}
