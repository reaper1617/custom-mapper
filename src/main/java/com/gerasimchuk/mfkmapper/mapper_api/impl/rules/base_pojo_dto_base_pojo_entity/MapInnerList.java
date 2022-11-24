package com.gerasimchuk.mfkmapper.mapper_api.impl.rules.base_pojo_dto_base_pojo_entity;

import com.gerasimchuk.mfkmapper.mapper_api.api.MappingRule;
import com.gerasimchuk.mfkmapper.dto_samples.BasePojoDto;
import com.gerasimchuk.mfkmapper.entity_samples.BasePojoEntity;
import com.gerasimchuk.mfkmapper.entity_samples.FirstInnerLevelPojoEntity;
import com.gerasimchuk.mfkmapper.entity_samples.SecondInnerLevelPojoEntity;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class MapInnerList implements MappingRule<BasePojoDto, BasePojoEntity> {

    @Override
    public BiConsumer<BasePojoDto, BasePojoEntity> mapper() {
        return (dto, entity) -> {
            entity.setInners(
                    dto.getInners().stream()
                            .map(firstInnerLevelPojoDto -> {
                                var e = new FirstInnerLevelPojoEntity();
                                e.setInnersMap(
                                        Map.of(1, new SecondInnerLevelPojoEntity())
                                );
                                return e;
                            })
                            .collect(Collectors.toSet())
            );
        };
    }
}
