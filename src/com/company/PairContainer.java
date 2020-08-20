package com.company;

public class PairContainer<L, R> {
    private L left;
    private R right;

    public PairContainer(L left, R right) {
        //System.out.println(left.getClass());
        this.left = left;

        // System.out.println(right.getClass());
        this.right = right;
    }

    @Override
    public String toString() {
        return "Left: " + left + " | Right: " + right;
    }
}
