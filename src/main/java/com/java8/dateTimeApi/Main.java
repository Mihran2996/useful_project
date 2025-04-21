package com.java8.dateTimeApi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Main {

    //What is an ISO Date Format?
    //ISO date format refers to the standard formats defined by the ISO-8601 specification — an international standard for representing dates and times in a clear,
    //consistent, and unambiguous way.

    //Example ISO-8601 Formats

    //Component	              Example Format	                   Description
    //Date	                    2025-04-21	                        YYYY-MM-DD
    //Time	                    14:30:00	                        HH:mm:ss (24-hour clock)
    //Date & Time	            2025-04-21T14:30:00	                T separates date and time
    //Zoned Date Time       	2025-04-21T14:30:00+05:30       	Includes timezone offset
    //UTC Instant	            2025-04-21T09:00:00Z	            Z means Zulu/UTC time


    //Working With LocalDate
    //The LocalDate represents a date in ISO format (yyyy-MM-dd) without time. We can use it to store dates like birthdays and paydays.

    //Example With LocalDateTIme
//    public static void main(String[] args) {
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formated = localDateTime.format(formatter);
//
//        LocalDateTime parsed = LocalDateTime.parse(formated, formatter);
//
//        System.out.println("localDateTime");
//        System.out.println(localDateTime);
//        System.out.println("---------------");
//        System.out.println("formated");
//        System.out.println(formated);
//        System.out.println("---------------");
//        System.out.println("parsed");
//        System.out.println(parsed);
//        System.out.println("---------------");
//    }

    //Using ZonedDateTime API
    //Java 8 provides ZonedDateTime when we need to deal with time-zone-specific date and time.
    //The ZoneId is an identifier used to represent different zones.
    //There are about 40 different time zones

    //Example ZoneId
//    public static void main(String[] args) {


//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formated = now.format(formatter);
//
//        System.out.println("now in my zone");
//        System.out.println(formated);
//
//
//        ZonedDateTime zonedDateTime = ZonedDateTime.of(now, ZoneId.systemDefault());
//        System.out.println("zonedDateTime");
//        System.out.println(zonedDateTime);
//
//       ZonedDateTime moscow = zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Moscow"));
//       System.out.println("moscow");
//       System.out.println(moscow);
//
//        LocalDateTime moscowLocalDateTime = moscow.toLocalDateTime();
//        System.out.println("moscowLocalDateTime");
//        System.out.println(moscowLocalDateTime);
//
//        ZonedDateTime uts = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
//        System.out.println("utc");
//        System.out.println(uts);

//    }


    //Example to convert UTC

//    public static void main(String[] args) {
//        String browserDate = "2025-04-20 20:00:01";
//
//        LocalDateTime utc = convertToUts(browserDate);
//        System.out.println(utc);
//
//        LocalDateTime browserDateConverted = convertToBrowserTime(utc);
//        System.out.println(browserDateConverted);
//    }

    private static LocalDateTime convertToUts(String browserTime){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsed = LocalDateTime.parse(browserTime, formatter);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(parsed, ZoneId.systemDefault());
        ZonedDateTime uts = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));

        //Getting uts time we save it to db
        return uts.toLocalDateTime();
    }

    private static LocalDateTime convertToBrowserTime(LocalDateTime utcTime){
        return ZonedDateTime.of(utcTime, ZoneId.of("UTC")).withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();

    }

    //Instant show current utc time

    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.of("Asia/Yerevan");
        ZonedDateTime zoneTime = ZonedDateTime.ofInstant(instant, zoneId);

        System.out.println(zoneTime);
    }

}
