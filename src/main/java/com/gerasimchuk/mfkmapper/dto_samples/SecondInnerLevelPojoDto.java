package com.gerasimchuk.mfkmapper.dto_samples;

import java.util.Objects;

public class SecondInnerLevelPojoDto {
    private Boolean booleanValue;

    public SecondInnerLevelPojoDto() {
        this.booleanValue = true;
    }

    public SecondInnerLevelPojoDto(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondInnerLevelPojoDto that = (SecondInnerLevelPojoDto) o;
        return Objects.equals(booleanValue, that.booleanValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booleanValue);
    }

    @Override
    public String toString() {
        return "SecondInnerLevelPojoDto{" +
                "booleanValue=" + booleanValue +
                '}';
    }
}
