package Exe4;

public class Peuple {
    // Attributs
    private Homme pays[] = new Homme[100];
    private int nbHommes = 0;

    // Méthode naissance ajoute un homme dans pays
    void naissance(Homme h) {
        pays[nbHommes++] = h;
        }

    /* Méthode explorer permet d'afficher le contenu de pays */
    void explorer() {
        for (int i = 0; i < nbHommes; i++) {
            pays[i].identite();
        }
    }
    
    // Méthode principale
    public static void main(String[] args) {
    Peuple p = new Peuple();
    p.naissance(new Personnes("Toto", "TATA"));
    p.naissance(new Client("Demo", "client", 11));
    p.naissance(new Client("Demo2", "client", 123));
    p.naissance(new Personnes("TITI", "TOTI"));
    p.explorer();
    }
}
