package Exe3TP5;

public class ExceptionTemps extends Exception {
  
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ExceptionTemps() {
        super("temps invalide");
    }
    public ExceptionTemps(String msg) {
        super(msg);
    }
}
