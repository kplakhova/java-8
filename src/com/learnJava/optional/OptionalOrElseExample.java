package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String optionalOrElse() {
//        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        return student.map(Student::getName).orElse("default");
    }

    //orElseGet
    public static String optionalOrElseGet() {
//        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        return student.map(Student::getName).orElseGet(() -> "default");
    }

    //orElseThrow
    public static String optionalOrElseThrow() {
//        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        return student.map(Student::getName).orElseThrow(() -> new RuntimeException("no data available"));
    }

    public static void main(String[] args) {
        System.out.println("name : " + optionalOrElse());
        System.out.println("name : " + optionalOrElseGet());
        System.out.println("name : " + optionalOrElseThrow());
    }
}
