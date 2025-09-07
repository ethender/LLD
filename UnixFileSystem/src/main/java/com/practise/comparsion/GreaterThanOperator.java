package com.practise.comparsion;

import java.util.Objects;

public class GreaterThanOperator<T extends Number> implements ComparsionOperator<T> {
    @Override
    public boolean isMatch(final T attributeValue, final T expectedValue) {
        return Double.compare(attributeValue.doubleValue(), expectedValue.doubleValue()) > 0;
    }
}
