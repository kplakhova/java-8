package com.learnJava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {

        /**
         * Sort the list names in alphabetical order
         */
        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");


        /**
         * Prior Java 8
         */
        Collections.sort(stringList);
        System.out.println("using Collections : " + stringList);

        /**
         * Java 8
         */
        stringList.sort(Comparator.reverseOrder());
        System.out.println("using List.sort() : " + stringList);
    }
}
