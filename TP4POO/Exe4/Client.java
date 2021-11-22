package Exe4;

public class Client extends Personnes{
    
    // Attributs
    private int numero;

    // Constructeur
    public Client(String nom, String prenom, int numero) {
    super(nom, prenom);
    this.numero = numero;
    }

    // Méthode identite
    @Override
    public void identite() {
    super.identite();
    System.out.println("Numéro client : " + numero);
    }
    
}
