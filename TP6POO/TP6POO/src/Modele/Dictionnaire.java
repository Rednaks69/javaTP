package Modele;

public class Dictionnaire extends Document {
    private String langue;
    private int nbTomes;

    public Dictionnaire(String t, String langue, int nbTomes) {
        super(t);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }

    public Dictionnaire(String t, int num, String langue, int nbTomes) {
        super(t, num);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }

    public String getLangue() {
        return langue;
    }

    public int getNbTomes() {
        return nbTomes;
    }

    @Override
    public String toString() {

        return super.toString() + " " + getLangue() + " " + getNbTomes();
    }
}
