package com.practise.predicate;

import com.practise.comparsion.ComparsionOperator;
import com.practise.io.File;
import com.practise.io.FileAttribute;

public class SimplePredicate<T> implements Predicate<T> {

    private final FileAttribute attributeName;

    private final ComparsionOperator<T> operator;

    T expectedValue;

    public SimplePredicate(final FileAttribute attributeName, final ComparsionOperator<T> operator, final T expectedValue){
        this.attributeName = attributeName;
        this.operator = operator;
        this.expectedValue = expectedValue;
    }


    @Override
    public boolean isMatch(File inputFile) {
        Object actualValue = inputFile.extract(attributeName);
        if(expectedValue.getClass().isInstance(actualValue)){
            return operator.isMatch((T) actualValue, expectedValue);
        }else{
            return false;
        }
    }
}
