package Exe1;

public class Etudiant extends Personne {
    private int numInscription;

    public Etudiant(String nom, String prenom, int numInscription) {
    super(nom, prenom);
    this.numInscription = numInscription;
    }

    public int getNumInscription() {
    return numInscription;
    }

    public void setNumInscription(int numInscription) {
    this.numInscription = numInscription;
    }
    
    @Override
    public String toString() {
    return super.toString() + " Etudiant{" + "numInscription=" + numInscription + '}';
    }
}
