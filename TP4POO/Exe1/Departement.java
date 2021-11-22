package Exe1;

public class Departement {
    public static void main(String[] args) {
       
        Etudiants e = new Etudiants(4);
        e.ajouterEtudiant(new Etudiant("ali", "ben moh", 1));
        e.ajouterEtudiant(new Etudiant("alia", "ben moh", 2));
        Etudiant ee = e.rechercherEtudiant(1);
        if (ee != null) {
            System.out.println(ee);
        }
        e.lister();
    }  

}

