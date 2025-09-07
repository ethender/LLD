package com.practise.predicate;

import com.practise.io.File;

import java.util.List;

public class NotPredicate implements CompositePredicate{
    private final Predicate operand;


    public NotPredicate(final Predicate operands){
        this.operand = operands;
    }

    @Override
    public boolean isMatch(File inputFile) {
        return ! operand.isMatch(inputFile);
    }
}
