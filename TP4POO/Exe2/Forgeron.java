package Exe2;

public class Forgeron extends Personne {
    public Forgeron(String nom) {
        super(nom);
    }
       
       
    @Override
    public String toString() {
    return (super.toString()+" le forgeron");
    }
}
