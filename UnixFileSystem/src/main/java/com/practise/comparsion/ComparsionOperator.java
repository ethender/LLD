package com.practise.comparsion;

public interface ComparsionOperator<T> {

    boolean isMatch(final T attributeValue, final T expectedValue);

}
