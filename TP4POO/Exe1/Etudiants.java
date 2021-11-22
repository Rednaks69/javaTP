package Exe1;

public class Etudiants {
    // attributs
    private Etudiant[] listeEtudiants;
    private int nbEtudiants;


    // constructeur, reçoit en paramètre la capacité max du tableau listeEtudiants
    public Etudiants(int n) {
        listeEtudiants = new Etudiant[n];
        nbEtudiants = 0;
    }


    // ajoute un étudiant
    public void ajouterEtudiant(Etudiant e) {
        if ((rechercherEtudiant(e.getNumInscription()) == null) && (nbEtudiants < listeEtudiants.length)) {
            listeEtudiants[nbEtudiants++] = e;
        }
    }
    
    // retourne l'étudiant ayant le numéro d'inscription passé en paramètre et
    // null sinon
    public Etudiant rechercherEtudiant(int num) {
        boolean trouve = false;
        Etudiant er = null;
        for (int i = 0; i < nbEtudiants && !trouve; i++) {
            if (listeEtudiants[i].getNumInscription() == num) {
                trouve = true;   
                er = listeEtudiants[i];
            }
        }
    return (er);
    }

    public void lister() {
        for (int i = 0; i < nbEtudiants; i++) {
        System.out.println(listeEtudiants[i]);
        }
    }
}
