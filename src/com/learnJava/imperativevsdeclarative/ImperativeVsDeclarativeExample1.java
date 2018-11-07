package com.learnJava.imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        /**
         * Imperative - how style of programming
         */

        int impSum = 0;
        for (int i = 0; i <= 100; i++) {
            impSum += i;
        }
        System.out.println("Sum using Imperative approach : " + impSum);

        /**
         * Declarative - what style of programming
         */

        int declSum = IntStream.rangeClosed(0, 100)
                .sum();
        System.out.println("Sum using Declarative approach : " + declSum);
    }
}
