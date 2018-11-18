package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers) {
        return integers
                .stream()
                .limit(3)
                .reduce((x, y) -> x + y);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers
                .stream()
                .skip(3)
                .reduce((x, y) -> x + y);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);

        Optional<Integer> sumWithLimit = limit(integers);
        if (sumWithLimit.isPresent()) {
            System.out.println("limit sum : " + sumWithLimit.get());
        }

        Optional<Integer> sumWithSkip = skip(integers);
        if (sumWithSkip.isPresent()) {
            System.out.println("skip sum : " + sumWithSkip.get());
        }

    }
}
