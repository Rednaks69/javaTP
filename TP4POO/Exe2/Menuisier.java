package Exe2;

public class Menuisier extends Personne {
    
    public Menuisier(String nom) {
        super(nom);
    }


    @Override
    public String toString() {
    return (super.toString()+" le menuisier");
    }
}
