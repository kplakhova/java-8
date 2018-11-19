package com.learnJava.parallelstreams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsExample1 {

    public static List<String> seqentialStudentActivities() {

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities)      // Stream<List<String>>
                .flatMap(List::stream)            // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sequential duration : " + (System.currentTimeMillis() - startTime));

        return studentActivities;
    }

    public static List<String> parallelStudentActivities() {

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .parallel()
                .map(Student::getActivities)      // Stream<List<String>>
                .flatMap(List::stream)            // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Parallel duration : " + (System.currentTimeMillis() - startTime));

        return studentActivities;
    }

    public static void main(String[] args) {
        seqentialStudentActivities();
        parallelStudentActivities();

    }
}
