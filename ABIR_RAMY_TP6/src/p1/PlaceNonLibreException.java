package p1;

public class PlaceNonLibreException extends Exception {
    public PlaceNonLibreException(String message) {
        super(message);
    }

    public PlaceNonLibreException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlaceNonLibreException(Throwable cause) {
        super(cause);
    }
}