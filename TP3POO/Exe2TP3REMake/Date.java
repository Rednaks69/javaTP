/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe2TP3REMake;

public class Date {
    private int jour;
    private int mois;
    private int annee;

    public Date(int jour, int mois , int annee){
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
    }

    int nombreJours(){
        int nbrjour=0;
        nbrjour=((mois == 1 || mois ==3 || mois ==5 || mois ==7 || mois ==8 || mois ==10 || mois ==12) ? 31 : 
        this.getMois() == 2 ? ((this.getAnnee()%4==0&&this.getAnnee()%100!=0)? 29 : (this.getAnnee() % 400 == 0)? 29 :28 ): 30);

    return nbrjour;
    }

    boolean dateValive(){
        boolean validite=false;
        validite=((getJour()<=nombreJours()&&getJour()>0)? true : false);
        return validite;
    }
    void lendemain(){
        if (dateValive()){
            if(getJour()==nombreJours()){
                if (mois==12){
                    annee++;
                    mois = 1; 
                    jour = 1;
                }else{
                    mois++;
                    jour=1;
                }
            }else{
                jour++;
            } 
     }else{
         System.out.print("date invalide ");
         System.out.println("Donner une autre date");
     }
    }

    void afficher(){
        if (dateValive())
            System.out.println("La date est valide et elle est le :  "+jour+"/"+mois+"/"+annee);
    }

    public int getJour() {
        return jour;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public void setJour(int jour) {
        this.jour = jour;
    } 
}
