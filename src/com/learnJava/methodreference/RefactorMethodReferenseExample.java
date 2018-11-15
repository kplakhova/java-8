package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenseExample {

    static Predicate<Student> predicate1 = RefactorMethodReferenseExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s) {
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {

        System.out.println(predicate1.test(StudentDataBase.studentSupplier.get()));

    }
}
