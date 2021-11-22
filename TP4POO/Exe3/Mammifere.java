package Exe3;

public abstract class Mammifere implements Son {
    // Attributs
    protected String nom, son;
    protected int age;

    // Constructeur
    public Mammifere(String nom, String son, int age) {
    this.nom = nom;
    this.son = son;
    this.age = age;
    }

    // Méthode parle affiche le son d'un mammifère
    public void parle() {
        System.out.println(son + this);
    }

    // Méthode abstraite vitesse
    public abstract void vitesse();

    // Méthode toString redéfinie
    public String toString() {
    return (" mon nom est " + nom + " j'ai " + age + " ans");
    }
}
