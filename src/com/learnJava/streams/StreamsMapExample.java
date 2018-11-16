package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {

        List<String> studentList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                // student as an input -> student name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String> -> uppercase operation on each input
                .collect(Collectors.toList()); //List<String>

        return studentList;
    }

    public static Set<String> namesSet() {

        Set<String> studentList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                // student as an input -> student name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String> -> uppercase operation on each input
                .collect(Collectors.toSet()); //Set<String>

        return studentList;
    }



    public static void main(String[] args) {

        System.out.println(namesList());
        System.out.println(namesSet());

    }
}
