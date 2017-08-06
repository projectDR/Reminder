package main;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Time;
import java.util.Calendar;

/**
 * Created by nomen on 21.07.17.
 */
class MementoTest {

    static Memento mt;
    Main main;

    @BeforeAll
    static void init()
    {
        mt = new Memento();
    }

    @BeforeEach
    void repeat()
    {
        main = new Main();
    }

    @DisplayName("Creation")
    @Test
    void createMemento()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,2,2,2,2);
        main.addMemento(new Memento("Message", calendar));

        assertNotNull(main.getAllMemento());

        if(main.getAllMemento().isEmpty())
            fail("Must not be empty");
    }


    @DisplayName("Correct")
    @Test
    void  createSpecified(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,2,2,2,2);
        Memento created = new Memento("Test", calendar);
        main.addMemento(created);

        Memento last = getLast();
        if(last.compareTo(created) == 0)
            fail("created and storaged methods do not match");
    }

    //TODO write this method after choose which storage we will use
    private Memento getLast()
    {
        throw new UnsupportedOperationException();
    }
}