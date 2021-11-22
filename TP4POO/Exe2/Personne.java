package Exe2;

public class Personne {
   
        protected String nom;
        
        public Personne(String nom) {
        this.nom = nom;
        }
        
        public String getNom() {
        return nom;
        }
        public void setNom(String nom) {
        this.nom = nom;
        }
       
        @Override
        public String toString() {
        return ("Je suis "+ nom);
        }
}
