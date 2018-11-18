package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

public class StreamsMatchExample {

    public static Boolean allMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch((student) -> student.getGpa() >= 3.5);
    }

    public static Boolean anyMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch((student) -> student.getGpa() >= 4.0);
    }

    public static Boolean noneMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .noneMatch((student) -> student.getGpa() > 4.0);
    }

    public static void main(String[] args) {

        System.out.println("allMatch result : " + allMatch());
        System.out.println("anyMatch result : " + anyMatch());
        System.out.println("noneMatch result : " + noneMatch());

    }
}
