package main;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by nomen on 21.07.17.
 */
public class Memento {

    private int id;
    private String message;
    private Calendar alarm;

    public Memento()
    {

    }

    public Memento(String message, Calendar alarm)
    {
        this.message = message;
        this.alarm = alarm;
    }

    public String getMessage() {
        return message;
    }

    public Calendar getAlarm() {
        return alarm;
    }
}
