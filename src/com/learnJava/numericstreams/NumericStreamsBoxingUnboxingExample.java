package com.learnJava.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integers) {
        return integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {

        List<Integer> boxing = boxing();
        System.out.println("boxing : " + boxing);
        System.out.println("unboxing : " + unboxing(boxing));
    }
}
