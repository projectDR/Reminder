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

    @DisplayName("")
    @Test
    void createMemento()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,2,2,2,2);
        main.addMemento(new Memento("Messtage", calendar));

        assertNotNull(main.getAllMemento());

        if(main.getAllMemento().isEmpty())
            fail("Must not be empty");
    }
}