package com.learnJava.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

    public static void parseLocalDateTime() {

        String dateTime = "2018-04-28T14:33:33";
        System.out.println(dateTime + " : " + LocalDateTime.parse(dateTime));

        System.out.println(dateTime + " : " + LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        /**
         * Custom format
         */
        String dateTime1 = "2018-04-28T14|33|33";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        System.out.println(dateTime1 + " : " + LocalDateTime.parse(dateTime1, formatter));

        String dateTime2 = "2018-04-28abc14|33|33";
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        System.out.println(dateTime2 + " : " + LocalDateTime.parse(dateTime2, formatter));
    }

    public static void formatLocalDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String convertedDateTime = localDateTime.format(formatter);
        System.out.println("convertedDateTime : " + convertedDateTime);

    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
