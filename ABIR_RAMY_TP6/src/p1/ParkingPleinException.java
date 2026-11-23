package p1;

public class ParkingPleinException extends Exception {
    public ParkingPleinException(String message) {
        super(message);
    }

    public ParkingPleinException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingPleinException(Throwable cause) {
        super(cause);
    }
}