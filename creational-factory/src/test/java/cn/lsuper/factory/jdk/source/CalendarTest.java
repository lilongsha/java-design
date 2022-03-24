package cn.lsuper.factory.jdk.source;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class CalendarTest {
    @Test
    public void calendarTest() {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTime());
    }
}
