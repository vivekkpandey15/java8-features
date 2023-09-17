package com.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeAPI {
    /* The existing classes (such as java.util.Date and SimpleDateFormatter) aren’t thread-safe, leading to potential
     * concurrency issues for the average developer would expect to deal with when writing date-handling code.
     * To Handle this issue  java.time API package introduced in Java 8.
     *
     * The new API is driven by three core ideas:
     *
     * 1. Immutable-value classes: One weaknesses of the existing formatters in Java is that they aren't thread-safe.
     *    The new API avoids this issue by ensuring that all its core classes are immutable and represent well-defined values.
     *
     * 2. Domain-driven design: The new API models its domain very precisely with classes that represent different use cases for
     *    Date and Time. This emphasis on domain-driven design offers login-term benefits around clarity and understandability,
     *    but you might need to think through your application's domain model of dates when porting from previous APIs to Java 8.
     *
     * 3. Separation of chronologies: The new API allows people to work with different calendaring systems in order to support
     *    the needs of users uin some of the world, such as Japan or Thailand, that don't necessarily follow ISO-8601.
     *
     *  LocalDate/LocalTime and LocalDateTime API : Use it when time zones are NOT required.
     *  Zoned date-time API : Use it when time zones are to be considered.
     *  Period : It deals with date based amount of time.
     *  Duration : It deals with time based amount of time.
     *  OffsetTime : TIME WITH TIMEZONE
     *  OffsetDateTime : TIMESTAMP WITH TIMEZONE
     *
     */

    public static void main(String[] args) {
        //LocalDate of current date
        LocalDate date = LocalDate.now();
        System.out.println("The Current date is : " + date);

        //LocalTime of current time
        LocalTime time = LocalTime.now();
        System.out.println("The Current time is : " + time);

        //LocalDateTime to give the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and Time : " + currentDateTime);

        //To print date in a particular format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = currentDateTime.format(format);
        System.out.println("Formatted Date : " + formatedDateTime);

        //Printing months days and seconds
        Month month = currentDateTime.getMonth();
        int day = currentDateTime.getDayOfMonth();
        int seconds = currentDateTime.getSecond();
        System.out.println("Month : " + month + " Day : " + day + " Second : " + seconds);

        //Print some specified date
        LocalDate date2 = LocalDate.of(1990, 7, 15);
        System.out.println("My BirthDate : " + date2);

        //Printing date with current time
        LocalDateTime specifiedDate = currentDateTime.withDayOfMonth(15).withYear(1990);
        System.out.println("Specified date with current date : " + specifiedDate);

        // To get the current zone
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("the current zone is " + currentZone.getZone());

        //It is used to return a copy of this date-time with a different time-zone, retaining the instant.
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
        System.out.println("tokyo time zone is " + tokyoZone);


        // Creating an object of class in main() method
        OffsetTime offset = OffsetTime.now();
        System.out.println("Offset : " + offset);
        int h = offset.getHour();
        System.out.println(h);

        int m = offset.get(ChronoField.MINUTE_OF_DAY);
        System.out.println(m);

        int s = offset.get(ChronoField.SECOND_OF_DAY);
        System.out.println(s);


        // now() is a method used to obtain current date and time from the system clock.
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        // Display the offsetDateTime which will display all current date and time.
        System.out.println(offsetDateTime);
        // Display the Hour,Minute, Second and Nanosecond using getHour(), getMinute(),
        // getSecond() and getNano()
        System.out.println("Hour  : " + offsetDateTime.getHour() + " Minute : " + offsetDateTime.getMinute() + " Second : " + offsetDateTime.getSecond() + " NanoSecond : " + offsetDateTime.getNano());


        String stringDate = "2011-10-02T14:45:30.123456789+05:30[Asia/Kolkata]";
        // creating a new ZonedDateTime object
        ZonedDateTime zone = ZonedDateTime.parse(stringDate);
        System.out.println(zone);


        //Get Week of Day from given date
        LocalDate dt = LocalDate.parse("2018-01-02");
        DayOfWeek str = dt.getDayOfWeek();
        System.out.println(str.toString());

    }
}
