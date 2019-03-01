package org.pascal.newdate.timeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by pascal on 3/1/19.
 */
public class ZonedDateTimeTester {
    public static void main(String args[]) {
        ZonedDateTimeTester java8tester = new ZonedDateTimeTester();
        java8tester.testZonedDateTime();
    }

    public void testZonedDateTime() {
        // Get the current date and time
        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }
}
