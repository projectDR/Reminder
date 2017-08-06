package exceptions;

/**
 * Created by nomen on 21.07.17.
 */
public class NoSuchMemento extends Exception {

    public NoSuchMemento()
    {
        super();
    }

    public NoSuchMemento(String message)
    {
        super(message);
    }
}
