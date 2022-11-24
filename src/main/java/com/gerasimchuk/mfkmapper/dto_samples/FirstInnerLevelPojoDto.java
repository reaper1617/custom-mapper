package com.gerasimchuk.mfkmapper.dto_samples;

import java.util.List;
import java.util.Objects;

public class FirstInnerLevelPojoDto {
    private Integer intValue;
    private List<SecondInnerLevelPojoDto> inners;

    public FirstInnerLevelPojoDto() {
        intValue = 10;
        inners = List.of(
                new SecondInnerLevelPojoDto(true)
        );
    }

    public FirstInnerLevelPojoDto(Integer intValue, List<SecondInnerLevelPojoDto> inners) {
        this.intValue = intValue;
        this.inners = inners;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public List<SecondInnerLevelPojoDto> getInners() {
        return inners;
    }

    public void setInners(List<SecondInnerLevelPojoDto> inners) {
        this.inners = inners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstInnerLevelPojoDto that = (FirstInnerLevelPojoDto) o;
        return Objects.equals(intValue, that.intValue) && Objects.equals(inners, that.inners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intValue, inners);
    }

    @Override
    public String toString() {
        return "FirstInnerLevelPojoDto{" +
                "intValue=" + intValue +
                ", inners=" + inners +
                '}';
    }
}
