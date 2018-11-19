package com.learnJava.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int sumSequentialStream() {
        return IntStream.rangeClosed(1,100000)
                .sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(1,100000)
                .parallel()
                .sum();
    }


    public static void main(String[] args) {

        System.out.println("available processors : " + Runtime.getRuntime().availableProcessors());
        System.out.println("sequential stream result : " + checkPerformanceResult(ParallelStreamsExample::sumSequentialStream, 20));
        System.out.println("parallel stream result : " + checkPerformanceResult(ParallelStreamsExample::sumParallelStream, 20));

    }
}
