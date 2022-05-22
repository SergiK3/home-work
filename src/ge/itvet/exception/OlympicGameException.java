package ge.itvet.exception;

public class OlympicGameException extends Exception {

    public OlympicGameException() {
    }

    public OlympicGameException(String message) {
        super(message);
    }

    public OlympicGameException(String message, Throwable cause) {
        super(message, cause);
    }

    public OlympicGameException(Throwable cause) {
        super(cause);
    }
}
