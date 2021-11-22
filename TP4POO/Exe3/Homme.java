package Exe3;

public class Homme extends Mammifere {
    // Attributs
    boolean marie;

    // Constructeur
    public Homme(String nom, String son, int age, boolean marie) {
    super(nom, son, age);
    this.marie = marie;
    }

    // Implémentation de la méthode vitesse
    public void vitesse() {
    System.out.println("Je cours à une vitesse de 20km/h");
    }

    // Méthode toString redéfinie
    public String toString() {
        if (marie) {
        return (super.toString() + " je suis marie");
        } else {
        return (super.toString() + " je suis célibataire");
        }
    }
}
