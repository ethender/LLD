package com.practise.predicate;

import com.practise.io.File;

public interface Predicate<T> {

    boolean isMatch(final File inputFile);
}
