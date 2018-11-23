package com.learnJava.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

    public static void main(String[] args) {

        LocalTime localTime1 = LocalTime.of(7, 20);
        LocalTime localTime2 = LocalTime.of(8, 20);

        long diffInMinutes = localTime1.until(localTime2, ChronoUnit.MINUTES);
        System.out.println("diffInMinutes : " + diffInMinutes);

        Duration duration = Duration.between(localTime1, localTime2);
        System.out.println("toMinutes : " + duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("toMinutes : " + duration1.toMinutes());

//      does not support LocalDate class
//        LocalDate localDate1 = LocalDate.now();
//        LocalDate localDate2 = LocalDate.now().plusDays(10);
//        Duration.between(localDate1, localDate2);
    }
}
