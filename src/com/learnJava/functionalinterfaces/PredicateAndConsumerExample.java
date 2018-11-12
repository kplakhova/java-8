package com.learnJava.functionalinterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student>  p1 = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student>  p2 = (student) -> student.getGpa() >= 3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) ->
        System.out.println(name + " : " +activities);

    BiPredicate<Integer, Double> studentBiPredicate =
            (gradeLevel, gpa) -> (gradeLevel >= 3) && (gpa >= 3.9);

    Consumer<Student> studentConsumer = (student -> {
        if (studentBiPredicate.test(student.getGradeLevel(), student.getGpa())) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
