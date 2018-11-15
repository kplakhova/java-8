package com.learnJava.functionalinterfaces;

public class FunctionExample1 {

    public static String performConcat(String s) {
        return FunctionExample.addSomeString.apply(s);
    }

    public static void main(String[] args) {

        String result = performConcat("Hello");

        System.out.println("Result : " + result);

    }
}
