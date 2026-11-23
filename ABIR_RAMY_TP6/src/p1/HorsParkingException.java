package p1;

public class HorsParkingException extends Exception {
    public HorsParkingException(String message) {
        super(message);
    }

    public HorsParkingException(String message, Throwable cause) {
        super(message, cause);
    }

    public HorsParkingException(Throwable cause) {
        super(cause);
    }
}