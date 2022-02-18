package com.example.backfullstack2201.modelo;

public class Range<T>{
    private T minimum;
    private T maximum;

    public T getMinimum() {
        return minimum;
    }

    public T getMaximum() {
        return maximum;
    }

    public Range(T minimum, T maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
