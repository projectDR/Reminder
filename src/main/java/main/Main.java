package main;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by nomen on 21.07.17.
 */
public class Main {

    Memento memento;

    public static void main(String[] args) {
    }

    public void addMemento(Memento memento)
    {
        throw new UnsupportedOperationException();
    }

    Memento getMementoById()
    {
        throw new UnsupportedOperationException();
    }

    List<Memento> getMementoByTime(Time time)
    {
        throw new UnsupportedOperationException();
    }

    List<Memento> getAllMemento()
    {
        throw new UnsupportedOperationException();
    }

    List<Memento> getMementoByInterval(Time start, Time stop)
    {
        throw new UnsupportedOperationException();
    }

    //delete all memento
    //or deactivate all active memento's
    void clearMemento()
    {
        throw new UnsupportedOperationException();
    }


}
