package Exe3TP5;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;
    Temps (int h, int m, int s)
    {
    heures = h;
    minutes = m;
    secondes = s;
    }


    public static void main (String [] args)
    {
        try {
            Temps t = new Temps (24, 12, 67);
            if ((t.heures<0)||(t.minutes<0)||(t.secondes<0)||(t.heures>23)||(t.minutes>59)||(t.secondes>59)) {
                throw new ExceptionTemps("le temps que vous avais choisie est incorrect");
            }
        } catch (ExceptionTemps ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
