package com.gerasimchuk.mfkmapper.mapper_api.api;

import java.util.List;

public interface MappingContext<POJO_FROM, POJO_TO> {
    List<MappingRule<POJO_FROM, POJO_TO>> getAllRules();
    MappingContext<POJO_FROM, POJO_TO> withRule(MappingRule<POJO_FROM, POJO_TO> mappingRule);
    default MappingContext<POJO_FROM, POJO_TO> withUniqueName(String uniqueName){
        return this;
    }
    MappingContext<POJO_FROM, POJO_TO> build();

    default MappingContext<POJO_FROM, POJO_TO> withRule(MappingContext<POJO_FROM, POJO_TO> mappingCtxRule) {
        mappingCtxRule.getAllRules().forEach(this::withRule);
        return this;
    }
}
