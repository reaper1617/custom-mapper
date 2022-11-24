package com.gerasimchuk.mfkmapper.mapper_api.impl;

import com.gerasimchuk.mfkmapper.mapper_api.api.MappingContext;
import com.gerasimchuk.mfkmapper.mapper_api.api.MappingRule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BaseMappingContext<F, R> implements MappingContext<F, R> {

    private final List<MappingRule<F, R>> mappingRules = new ArrayList<>();
    private String uniqueName;
    private boolean built = false;


    @Override
    public MappingContext<F, R> withUniqueName(String uniqueName) {
        checkIfAlreadyBuilt();
        this.uniqueName = uniqueName;
        return this;
    }

    @Override
    public List<MappingRule<F, R>> getAllRules() {
        if (built) {
            return Collections.unmodifiableList(mappingRules);
        }
        return mappingRules;
    }

    @Override
    public MappingContext<F, R> withRule(MappingRule<F, R> mappingRule) {
        checkIfAlreadyBuilt();
        mappingRules.add(mappingRule);
        return this;
    }

    @Override
    public MappingContext<F, R> build() {
        checkIfAlreadyBuilt();
        Objects.requireNonNull(uniqueName);
        this.built = true;
        return this;
    }

    protected void checkIfAlreadyBuilt() {
        if (built) {
            throw new UnsupportedOperationException("Object has already been built");
        }
    }

    protected void checkIfNotBuiltYet() {
        if (!built) {
            throw new UnsupportedOperationException("Object is not built yet");
        }
    }
}
