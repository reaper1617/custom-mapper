package com.gerasimchuk.mfkmapper.entity_samples;

import java.util.Set;

public class BasePojoEntity {
    private String firstStringField;
    private String secondStringField;
    private Set<FirstInnerLevelPojoEntity> inners;

    public String getFirstStringField() {
        return firstStringField;
    }

    public void setFirstStringField(String firstStringField) {
        this.firstStringField = firstStringField;
    }

    public String getSecondStringField() {
        return secondStringField;
    }

    public void setSecondStringField(String secondStringField) {
        this.secondStringField = secondStringField;
    }

    public Set<FirstInnerLevelPojoEntity> getInners() {
        return inners;
    }

    public void setInners(Set<FirstInnerLevelPojoEntity> inners) {
        this.inners = inners;
    }

    @Override
    public String toString() {
        return "BasePojoEntity{" +
                "firstStringField='" + firstStringField + '\'' +
                ", secondStringField='" + secondStringField + '\'' +
                ", inners=" + inners +
                '}';
    }
}
