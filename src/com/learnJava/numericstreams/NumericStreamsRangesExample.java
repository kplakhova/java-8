package com.learnJava.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {

    public static void main(String[] args) {

        System.out.println("range count : " + IntStream.range(1, 50).count());
        IntStream.range(1, 50).forEach((value) -> System.out.print(value + ", "));

        System.out.println();
        System.out.println("range closed count : " + IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach((value) -> System.out.print(value + ", "));

        System.out.println();
        System.out.println("long range closed count : " + LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(1, 50).forEach((value) -> System.out.print(value + ", "));

        System.out.println();
        IntStream.rangeClosed(1, 50).asDoubleStream().forEach((value) -> System.out.print(value + ", "));
    }
}
