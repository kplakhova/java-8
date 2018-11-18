package com.learnJava.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNumbers(List<Integer> integers) {
        return integers.stream()
                .reduce(0, (x, y) -> x + y);
    }

    public static int sumOfNumbersIntStream() {
        return IntStream.rangeClosed(1, 6)
                .sum();
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("sumOfNumbers : " + sumOfNumbers(integers));
        System.out.println("sumOfNumbersIntStream : " + sumOfNumbersIntStream());
    }
}
