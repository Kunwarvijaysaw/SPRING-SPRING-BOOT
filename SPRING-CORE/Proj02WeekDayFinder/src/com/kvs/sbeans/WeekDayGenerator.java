package com.kvs.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WeekDayGenerator {

    private LocalTime time;

    // setter for DI
    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String generateWeekDay(String msg) {
        return msg + "\n"+
               LocalDate.now().getDayOfWeek() ;
              
    }
}
