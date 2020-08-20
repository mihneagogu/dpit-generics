package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    }


    private static void mapEx() {
        Container<Integer> cont = new Container<>(12);

        Container<Integer> twentyFour = cont.map(i -> i * 2);
        System.out.println(twentyFour);

        Container<PairContainer<Integer, String>> transformed = cont.map((i) -> {
            System.out.println("Making a container by making a new PairContainer<Integer, String> with the values {36, \"hehe\"}");
            return new PairContainer<Integer, String>(12 * 3, "hehe");
        });

        System.out.println(transformed.getInner());

    }

    private static void func() {
        Funct<Integer, Integer> timesTwo = i -> i * 2;
        System.out.println(timesTwo.apply(23));

        System.out.println();

        Funct<Integer, PairContainer<Integer, String>> pairMakes = (i) -> new PairContainer<>(i, "good ol' string");
        System.out.println(pairMakes.apply(123));

    }

    private static void containers() {
        Container<String> cont = new Container<>("Asdasd");

        Container<IntOperation> intopContainer = new Container<>((a, b) -> a * b);
        int res = intopContainer.getInner().operation(2, 3);
        System.out.println(res);

        System.out.println();

        Container<IntOperation> anonIntopCOntainer = new Container<>(new AnonymousIntOperation());
        int res2 = anonIntopCOntainer.getInner().operation(2, 3);
        System.out.println(res2);

    }

    private static void doubleGeneric() {
        PairContainer<Integer, String> pair = new PairContainer<>(23, "asd");
        System.out.println(pair);
    }

    private static void functionalInterfaces() {
        IntOperation op = (left, right) -> (left + right) * 3;
        System.out.println(op.add(1, 2));

        IntOperation op2 = new AnonymousIntOperation();
        System.out.println(op2.add(1, 2));
    }
}
