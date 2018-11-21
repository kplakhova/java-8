package com.learnJava.defaults;

public interface Interface4 {
    default void methodA() {
        System.out.println("inside method A " + Interface4.class);
    }
}
