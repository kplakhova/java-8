package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, Integer::max);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer::min);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer::max);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6 , 7, 8, 9, 10);

        System.out.println("findMaxValue : " + findMaxValue(integerList));

        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        if (maxValueOptional.isPresent()) {
            System.out.println("findMaxValueOptional : " + maxValueOptional.get());
        } else {
            System.out.println("input list is empty");
        }

        Optional<Integer> minValue = findMinValue(integerList);
        if (minValue.isPresent()) {
            System.out.println("findMinValue : " + minValue.get());
        }
    }
}
