package Exe4;

public class Personnes implements Homme{
    // Attributs
    protected String nom, prenom;

    // Constructeur
    public Personnes(String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
    }

    /* Méthode identite : affiche les informations concernant un personne */
    @Override
    public void identite() {
    System.out.println("Nom: " + nom);
    System.out.println("Prénom : " + prenom);
    }
    
}
