package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsSortExample {

    static Consumer<Student> studentConsumer = (System.out::println);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);


    public static void sortByName(List<Student> studentList) {
        studentList.sort(nameComparator);
    }

    public static void sortByGPA(List<Student> studentList) {
        studentList.sort(gradeComparator);
    }

    public static void comparatorChaining(List<Student> studentList) {
        studentList.sort(gradeComparator.thenComparing(nameComparator));
    }

    public static void sortWithNullValues(List<Student> studentList) {
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("before sort :");
        studentList.forEach(studentConsumer);

//        sortByName(studentList);
//        sortByGPA(studentList);
//        comparatorChaining(studentList);
        sortWithNullValues(studentList);

        System.out.println("after sort :");
        studentList.forEach(studentConsumer);
    }
}
