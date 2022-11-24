package com.gerasimchuk.mfkmapper.dto_samples;

import java.util.List;
import java.util.Objects;

public class BasePojoDto {

    private String stringField;
    private List<FirstInnerLevelPojoDto> inners;

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public List<FirstInnerLevelPojoDto> getInners() {
        return inners;
    }

    public void setInners(List<FirstInnerLevelPojoDto> inners) {
        this.inners = inners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasePojoDto that = (BasePojoDto) o;
        return Objects.equals(stringField, that.stringField) && Objects.equals(inners, that.inners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stringField, inners);
    }

    @Override
    public String toString() {
        return "BasePojoDto{" +
                "stringField='" + stringField + '\'' +
                ", inners=" + inners +
                '}';
    }
}
