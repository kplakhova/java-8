package com.learnJava.parallelstreams;

import java.util.stream.IntStream;

public class SumClient {



    public static void main(String[] args) {

        Sum sum = new Sum();

        //do not use parallel
        IntStream.rangeClosed(1,1000)
                .forEach(sum::performSum);

        System.out.println("result : " + sum.getTotal());
    }
}
