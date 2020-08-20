package com.company;

public class AnonymousIntOperation implements IntOperation {

    public int operation(int a, int b) {
        return (a + b) * 3;
    }

    @Override
    public int add(int a, int b) {
        // OH NO
        return 0;
    }

}
