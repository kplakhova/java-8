package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMapReduceExample {

    private static int numberOfNotebooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getGradeLevel() >= 3 ))
                .filter((student -> student.getGender().equals("female")))
                .map(Student::getNoteBooks)
                //.reduce(0 , (a, b) -> a + b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("numberOfNotebooks : " + numberOfNotebooks());
    }
}
