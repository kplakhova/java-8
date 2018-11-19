package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {

        Student student = StudentDataBase.studentSupplier.get();
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {

        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (student.isPresent()) {
            return student.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

//        String studentName = getStudentName();
//        if (studentName != null) {
//            System.out.println("name length : " + studentName.length());
//        } else {
//            System.out.println("Student is not found");
//        }

        Optional<String> studentNameOptional = getStudentNameOptional();
        if (studentNameOptional.isPresent()) {
            System.out.println("name length : " + studentNameOptional.get().length());
        } else {
            System.out.println("name is not found");
        }
    }
}
