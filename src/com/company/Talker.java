package com.company;

@FunctionalInterface
public interface Talker {
    void talk();
    default void hello() {
        System.out.println("Hello my darlings");
    }
}
