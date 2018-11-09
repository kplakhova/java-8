package com.learnJava.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> testPredicate1 = (i) -> i%2 == 0;

    static Predicate<Integer> testPredicate2 = (i) -> i%5 == 0;

    public static void predicateAnd() {
        System.out.println("Predicate And result is : " +
                testPredicate1.and(testPredicate2).test(10)); //predicate chaining
        System.out.println("Predicate And result is : " +
                testPredicate1.and(testPredicate2).test(9)); //predicate chaining
    }

    public static void predicateOr() {
        System.out.println("Predicate Or result is : " +
                testPredicate1.or(testPredicate2).test(10)); //predicate chaining
        System.out.println("Predicate Or result is : " +
                testPredicate1.or(testPredicate2).test(8)); //predicate chaining
    }

    public static void predicateNegate() {
        System.out.println("Predicate Negate result is : " +
                testPredicate1.or(testPredicate2).negate().test(8)); //predicate chaining
    }


    public static void main(String[] args) {

        System.out.println(testPredicate1.test(4));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
