package com.example.backfullstack2201.modelo;



@FunctionalInterface
public interface FilterBehaviour<T> {
    boolean test(T o);
}
