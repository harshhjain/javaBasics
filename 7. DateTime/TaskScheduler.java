package com.harsh.demo;

import jdk.jfr.Event;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;
/*import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;*/



public class Main {

    public static void main(String[] args) {

        Clock testClock = Clock.fixed(Instant.EPOCH, ZoneOffset.UTC);

        //Create a calendar
        //SchedulerCalendar calendar = new SchedulerCalendar();
        Calendar calendar = new Calendar();

        //add some tasks to the calendar
        calendar.addTask("Reply P1 e-mails", 1, 0);
        calendar.addTask("Reply P2 e-mails", 4, 0);
        calendar.addTask("Reply P3 e-mails", 4, 0);

        //add some work periods to the calendar
        LocalDate clockDate = LocalDate.now(testClock);
        LocalDate mondayStart = clockDate.with(TemporalAdjuster.nextOrSame(DayOfWeek.MONDAY));
        List<WorkPeriod> periods = WorkPeriods.generateWorkPeriods(LocalDate.now(testClock),3);
        calendar.addWorkPeriods(periods);

        //add an event to the calendar
        ZonedDateTime meetingStartTime = ZonedDateTime.of(mondayStart, LocalTime.of(7, 30), ZoneId.of("America/New_York"));
        Event nyPlanningMeeting = Event.of(meetingStartTime, Duration.ofHours(1), "New York Planning");
        calendar.addEvent(nyPlanningMeeting);

        //create a working schedule
        Schedule schedule = calendar.createSchedule(mondayStart, ZoneId.of("Europe/London"));

        // and print it out
        System.out.println(schedule);
        
    }
}
