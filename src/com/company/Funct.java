package com.company;

@FunctionalInterface
public interface Funct<T, R> {
    R apply(T value);
}
