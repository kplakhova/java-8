package com.learnJava.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void parseLocalDate() {

        /**
         * String to a LocalDate
         */
        String date = "2018-04-28";
        System.out.println("localDate : " + LocalDate.parse(date));

        System.out.println(date + " : " + LocalDate.parse(date, DateTimeFormatter.ISO_DATE));

        String date1 = "20180428";
        System.out.println(date1 + " : " + LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE));

        /**
         * Custom defined dateformat
         */
        String date2 = "2018|04|28";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        System.out.println(date2 + " : " + LocalDate.parse(date2, formatter));

        String date3 = "2018*04*28";
        formatter = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        System.out.println(date3 + " : " + LocalDate.parse(date3, formatter));

//        not supported symbols
//        String date4 = "2018#04#28";
//        formatter = DateTimeFormatter.ofPattern("yyyy#MM#dd");
//        System.out.println(date4 + " : " + LocalDate.parse(date4, formatter));
    }

    public static void formatLocalDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        System.out.println("formatted date : " + localDate.format(formatter));
    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
