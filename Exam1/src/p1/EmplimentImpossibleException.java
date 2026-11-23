package p1;

public class EmplimentImpossibleException extends Exception {
    
    // Constructeur sans paramètre
    public EmplimentImpossibleException() {
        super("L'empilement est impossible sur ce bloc.");
    }

    // Constructeur avec un message personnalisé
    public EmplimentImpossibleException(String message) {
        super(message);
    }
}