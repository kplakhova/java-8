package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                // a = 1  b = 1 => 1
                // a = 1  b = 3 => 3
                // a = 3  b = 5 => 15
                // a = 15 b = 7 => 105
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                // a = 1  b = 1 => 1
                // a = 1  b = 3 => 3
                // a = 3  b = 5 => 15
                // a = 15 b = 7 => 105
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((student1, student2) ->
                        (student1.getGpa() > student2.getGpa()) ? student1 : student2);
    }


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 3, 5, 7);

        System.out.println("performMultiplication : " + performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);

        if (result.isPresent()) {
            System.out.println("performMultiplicationWithoutIdentity : " + result.get());
        }

        Optional<Student> highestGPAStudent = getHighestGPAStudent();
        if (highestGPAStudent.isPresent()) {
            System.out.println("getHighestGPAStudent : " + highestGPAStudent.get());
        }
    }
}
