package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getGpa() >= 3.9))
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getGpa() >= 3.9))
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> anyStudent = findAnyStudent();
        if (anyStudent.isPresent()) {
            System.out.println("findAnyStudent : " + anyStudent.get());
        }

        Optional<Student> firstStudent = findFirstStudent();
        if (firstStudent.isPresent()) {
            System.out.println("findFirstStudent : " + firstStudent.get());
        }
    }
}
