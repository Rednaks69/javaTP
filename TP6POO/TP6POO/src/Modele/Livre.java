package Modele;

public class Livre extends Document {
    private String auteur;
    private int nbPages;

    public Livre(String t, String auteur, int nbPages) {
        super(t);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public Livre(String t, int num, String auteur, int nbPages) {
        super(t, num);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    @Override
    public String toString() {

        return super.toString() + " " + getAuteur() + " " + getNbPages();
    }
}
