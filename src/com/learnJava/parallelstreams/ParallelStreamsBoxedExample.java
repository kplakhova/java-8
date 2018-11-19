package com.learnJava.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamsBoxedExample {

    public static int sequentialSum(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        Integer sum = integerList
                .stream()
                .reduce(0, (x, y) -> x + y); // perform the unboxing
        System.out.println("sequential duration : " + (System.currentTimeMillis() - startTime));
        return sum;
    }

    public static int parallelSum(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        Integer sum = integerList
                .parallelStream()
                .reduce(0, (x, y) -> x + y); // perform the unboxing
        System.out.println("parallel duration : " + (System.currentTimeMillis() - startTime));
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integerList = IntStream.rangeClosed(1, 10000)
                .boxed()
                .collect(Collectors.toList());

        sequentialSum(integerList);
        parallelSum(integerList);


    }
}
