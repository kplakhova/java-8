package com.learnJava.defaults;

import java.util.Arrays;
import java.util.List;

public class MuiltiplierClient {

    public static void main(String[] args) {

        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1, 3, 5);

        System.out.println("result is : " + multiplier.multiply(integerList));
        System.out.println("default method size is : " + multiplier.size(integerList));
        System.out.println("static method size is : " + Multiplier.isEmpty(integerList));
    }
}
