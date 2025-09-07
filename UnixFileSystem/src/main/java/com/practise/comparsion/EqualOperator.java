package com.practise.comparsion;

import java.util.Objects;

public class EqualOperator<T> implements ComparsionOperator<T>{


    @Override
    public boolean isMatch(final T attributeValue,final T expectedValue) {
        return Objects.equals(attributeValue,expectedValue);
    }
}
