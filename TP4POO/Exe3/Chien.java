package Exe3;

public class Chien extends Mammifere {
    // Attributs
    String race;

    // Constructeur
    public Chien(String nom, String son, int age, String race) {
    super(nom, son, age);
    this.race = race;
    }

    // Implémentation de la méthode vitesse
    public void vitesse() {
    System.out.println("Je cours à une vitesse de 30km/h");
    }

    // Méthode toString redéfinie
    public String toString() {
    return (super.toString() + " j'appartient à la race des " + race);
    }
    
}
