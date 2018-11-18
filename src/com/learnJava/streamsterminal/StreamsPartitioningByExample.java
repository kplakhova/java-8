package com.learnJava.streamsterminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {

    public static Map<Boolean, List<Student>> partitioningBy1() {
        Predicate<Student> predicate = student -> student.getGpa() >= 3.8;
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(predicate));
    }

    public static Map<Boolean, Set<Student>> partitioningBy2() {
        Predicate<Student> predicate = student -> student.getGpa() >= 3.8;
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(predicate, toSet()));
    }

    public static void main(String[] args) {

        System.out.println(partitioningBy1());
        System.out.println();
        System.out.println(partitioningBy2());
    }
}
