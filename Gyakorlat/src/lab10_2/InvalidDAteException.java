package lab10_2;

public class InvalidDAteException extends Exception {
    public InvalidDAteException(String invalid_date) {
        super(invalid_date);
    }
}
