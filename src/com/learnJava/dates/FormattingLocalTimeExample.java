package com.learnJava.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

    public static void parseTime() {
        String time = "13:00";
        System.out.println("localTime : " + LocalTime.parse(time));

        System.out.println(time + " : " + LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME));

        /**
         * custom defined format
         */
        String time1 = "13*00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH*mm");
        System.out.println(time1 + " : " + LocalTime.parse(time1, formatter));

        String time2 = "13*00*02";
        formatter = DateTimeFormatter.ofPattern("HH*mm*ss");
        System.out.println(time2 + " : " + LocalTime.parse(time2, formatter));
    }

    public static void formatTime() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime localTime = LocalTime.now();
        System.out.println("formatted time : " + localTime.format(formatter));
    }

    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
