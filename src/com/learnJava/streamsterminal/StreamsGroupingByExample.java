package com.learnJava.streamsterminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static Map<String, List<Student>> groupStudentByGender() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>> customizeGroupStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy((student) ->
                        student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy((student) ->
                                student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
    }

    public static Map<String, Integer> twoLevelGrouping2() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNoteBooks)));
    }

    public static LinkedHashMap<String, Set<Student>> threeArgumentGroupBy() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
    }

    public static Map<Integer, Student> calculateTopGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }

    public static Map<Integer, Student> calculateLeastGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }


    public static void main(String[] args) {

        System.out.println(groupStudentByGender());
        System.out.println();
        System.out.println(customizeGroupStudent());
        System.out.println();
        System.out.println(twoLevelGrouping1());
        System.out.println();
        System.out.println(twoLevelGrouping2());
        System.out.println();
        System.out.println(threeArgumentGroupBy());
        System.out.println();
        System.out.println(calculateTopGpa());
        System.out.println();
        System.out.println(calculateLeastGpa());
    }
}
