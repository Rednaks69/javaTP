
public class InvalidNumberException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = -1912943195805665715L;

    public InvalidNumberException() {
        super("nombre invalide, le nombre doit etre entre 1 et 10");
    }

    public InvalidNumberException(String msg) {
        super(msg);
    }
}
