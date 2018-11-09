package com.learnJava.functionalinterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> predicate1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> predicate2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {

        System.out.println("filterStudentByGradeLevel :");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if (predicate1.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGpa() {

        System.out.println("filterStudentByGpa :");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if (predicate2.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents() {

        System.out.println("filterStudents :");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if (predicate2.or(predicate2).negate().test(student)) {
                System.out.println(student);
            }
            else {
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
    }
}
