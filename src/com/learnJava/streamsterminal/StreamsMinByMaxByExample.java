package com.learnJava.streamsterminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minBy() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {

        Optional<Student> student = minBy();
        if (student.isPresent()) {
            System.out.println(student.get());
        } else {
            System.out.println("not found");
        }

        student = maxBy();
        if (student.isPresent()) {
            System.out.println(student.get());
        } else {
            System.out.println("not found");
        }
    }
}
