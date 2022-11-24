package com.gerasimchuk.mfkmapper.entity_samples;

import java.util.Map;
import java.util.Objects;

public class FirstInnerLevelPojoEntity {
    private Map<Integer, SecondInnerLevelPojoEntity> innersMap;

    public Map<Integer, SecondInnerLevelPojoEntity> getInnersMap() {
        return innersMap;
    }

    public void setInnersMap(Map<Integer, SecondInnerLevelPojoEntity> innersMap) {
        this.innersMap = innersMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstInnerLevelPojoEntity that = (FirstInnerLevelPojoEntity) o;
        return Objects.equals(innersMap, that.innersMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(innersMap);
    }

    @Override
    public String toString() {
        return "FirstInnerLevelPojoEntity{" +
                "innersMap=" + innersMap +
                '}';
    }
}
