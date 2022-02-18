package com.example.backfullstack2201.modelo;

import java.util.function.Predicate;

public abstract class Filter<T,S> {
    private Range<T> range;
    public abstract S filtering(S s);

    public T getMinimum() {
        return range.getMinimum();
    }

    public T getMaximum() {
        return range.getMaximum();
    }

    public Range<T> getRange() {
        return range;
    }

    public void setRange(Range<T> range) {
        this.range = range;
    }
}
