package com.practise.comparsion;

import java.util.regex.Pattern;

public class RegexMatchOperator<T extends String> implements ComparsionOperator<T> {


    @Override
    public boolean isMatch(final T attributeValue,final T expectedValue) {
        final Pattern p = Pattern.compile(expectedValue);
        return  p.matcher(attributeValue).matches();
    }
}
