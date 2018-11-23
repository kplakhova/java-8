package com.learnJava.dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : " + zonedDateTime);
        System.out.println("getOffset     : " + zonedDateTime.getOffset());
        System.out.println("getZone       : " + zonedDateTime.getZone());

//        System.out.println("available zones : ");
//        ZoneId.getAvailableZoneIds()
//                .stream()
//                .forEach((zone) -> System.out.println(zone));

        System.out.println("No of supported timezones : " + ZoneId.getAvailableZoneIds().size());

        System.out.println("Chicago CST   : " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("Detroit CST   : " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("LA PST        : " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("Denver MST    : " + ZonedDateTime.now(ZoneId.of("America/Denver")));

        System.out.println("using clock   : " + ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
        System.out.println("Detroit       : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
        System.out.println("Detroit       : " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("ofInstant     : " + localDateTime2);

        /**
         * convert from localdatetime, instant to zoneddatetime
         */
        ZonedDateTime zonedDateTime1 = LocalDateTime.now().atZone(ZoneId.of("America/Chicago"));
        System.out.println("atZone         : " + zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Chicago"));
        System.out.println("atZone         : " + zonedDateTime2);

        OffsetDateTime offsetDateTime = LocalDateTime.now().atOffset(ZoneOffset.ofHours(-6));
        System.out.println("offsetDateTime : " + offsetDateTime);
    }
}
