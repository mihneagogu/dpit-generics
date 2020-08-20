package com.company;

@FunctionalInterface
public interface IntOperation {
    int operation(int a, int b);
    default int add(int a, int b) {
        return a + b;
    }
}
