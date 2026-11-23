package p1;

public class PlaceLibreException extends Exception {
    public PlaceLibreException(String message) {
        super(message);
    }

    public PlaceLibreException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlaceLibreException(Throwable cause) {
        super(cause);
    }
}