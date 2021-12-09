package Modele;

import java.util.ArrayList;

public class Document {
    private String Titre;
    private int numEnrg = -1;
    public ArrayList<Integer> numEnrgList = new ArrayList<>();

    public Document(String t) {
        Titre = t;
        // numEnrg = (numEnrgList.contains(numEnrg)) ? +1 : numEnrg;
        numEnrg++;
        numEnrgList.add(numEnrg);
    }

    public Document(String t, int num) {
        Titre = t;
        numEnrg = (numEnrgList.contains(num)) ? num + 1 : num;
        numEnrgList.add(numEnrg);

    }

    private String getTitre() {
        return Titre;
    }

    public int getNumEnrg() {
        return numEnrg;
    }

    @Override
    public String toString() {
        return getTitre() + " " + getNumEnrg();
    }

}
