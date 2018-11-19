package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        student
                .filter(student1 -> student1.getGpa() >= 3.5)
                .ifPresent(student1 -> System.out.println(student1));
    }

    //map
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            Optional<String> name = studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(name);
        }
    }

    //flatMap
    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            Optional<String> name = studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        optionalFilter();
        optionalMap();

    }
}
