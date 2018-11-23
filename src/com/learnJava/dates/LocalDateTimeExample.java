package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 03, 21, 23, 33, 33, 978);
        System.out.println("localDateTime1 : " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2 : " + localDateTime2);

        /**
         * get the values from LocalDateTime instance
         */
        System.out.println("getHour : " + localDateTime.getHour());
        System.out.println("getMinute : " + localDateTime.getMinute());
        System.out.println("getDayOfMonth : " + localDateTime.getDayOfMonth());
        System.out.println("ChronoField.DAY_OF_MONTH : " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        /**
         * modify the value of LocalDateTime instance
         */
        System.out.println("plusHours : " + localDateTime.plusHours(2));
        System.out.println("minusDays : " + localDateTime.minusDays(2));
        System.out.println("withMonth : " + localDateTime.withMonth(12));


        //convert localdate, localtime to localdatetime
        LocalDate localDate = LocalDate.of(2019, 01, 01);
        System.out.println("atTime : " + localDate.atTime(23,13));

        LocalTime localTime = LocalTime.of(23, 39);
        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println("atDate : " + localDateTime3);
        System.out.println("toLocalDate : " + localDateTime3.toLocalDate());
        System.out.println("toLocalTime : " + localDateTime3.toLocalTime());
    }
}
