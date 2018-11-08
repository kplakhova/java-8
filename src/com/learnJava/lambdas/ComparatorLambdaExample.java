package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2); // 0 -> i1==i2
                                         // 1 -> i1>i2
                                         //-1 -> i1<i2
            }
        };
        System.out.println("Result of the comparator is : " + comparator.compare(3,2));

        /**
         * Java 8
         */
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambda is : " + comparatorLambda.compare(3,2));

        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambda is : " + comparatorLambda1.compare(3,2));
    }
}
