/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe2Tp3;



public class Date {
    private int jour;
    private int moi;
    private int annee;

    
    public Date(int jour, int moi , int annee){
        this.jour=jour;
        this.moi=moi;
        this.annee=annee;
    }
    
    void nombreJours(){
        int nbrjour=0;

        if(this.getMoi()==1 || this.getMoi()==3 || this.getMoi() == 5 || this.getMoi() == 7 || this.getMoi()== 8 || this.getMoi() == 10 || this.getMoi() == 12 ){
            nbrjour=31;
        }else if ( this.getMoi() == 2){
            if( this.getAnnee() % 4 == 0 && this.getAnnee() % 100!=0){
                nbrjour = 29;
                }else if (this.getAnnee() % 400 == 0){
                    nbrjour = 29;
                }else{
                    nbrjour = 28;
                }
        }else{
            nbrjour = 30;
        } 
        
      System.out.println(nbrjour);  
    }
    void dateValide(){
        if(this.getMoi()==1 || this.getMoi()==3 || this.getMoi() == 5 || this.getMoi() == 7 || this.getMoi()== 8 || this.getMoi() == 10 || this.getMoi() == 12 ){
            if(jour<=31 && jour>0){
                System.out.println("date valide");
            }else{
                System.out.println("date invalide");
            }
        }else if ( this.getMoi() == 2){
            if( this.getAnnee() % 4 == 0 && this.getAnnee() % 100!=0){
                if(this.getJour()<=29 && this.getJour()>0){
                    System.out.println("date valide");
                }else{
                    System.out.println("date invalide");
                }
                }else if (this.getAnnee() % 400 == 0){
                    if(this.getJour()<=29 && this.getJour()>0){
                        System.out.println("date valide");
                    }else{
                        System.out.println("date invalide");
                    }
                }else{
                    if(this.getJour()<=28 && this.getJour()>0){
                        System.out.println("date valide");
                    }else{
                        System.out.println("date invalide");
                    }
                }
            }else{
                if(this.getJour()<30){
                    System.out.println("Date valide ");
                }else{
                    System.out.println("Date invalide ");
                }
            }
    }

    void lendemain(){
        if (jour>0){
            if( moi==1 || moi==3 || moi == 5 || moi == 7 || moi== 8 || moi == 10 || moi == 12 ){
           if (moi == 12){
              if (jour ==31){
                annee++;
                moi = 1; 
                jour = 1;
              } else{ 
                  jour++;
              }
           }else{
            if (jour ==31){
                moi = 1; 
                jour = 1;
              } else{ 
                  jour++;
              }
               
           }
        }else if ( moi == 2){
            if( annee % 4 == 0 && annee % 100!=0){
                if(jour == 29){
                    moi++;
                    jour=1;
                }else{
                    jour++;
                }
                }else if (annee % 400 == 0){
                    if(jour == 29){
                        moi++;
                        jour=1;
                    }else{
                        jour++;
                    }
                }else{
                    if(jour == 28){
                        moi++;
                        jour=1;
                    }else{
                        jour++;
                    }
                }
        }else if(moi==4 || moi==6 || moi == 9 || moi == 11 ){
           if(jour ==30) {
               moi++;
            jour=1;
           }else{
            jour ++ ;
        }
        }}
    }

    void affiche(){
        System.out.println(jour+"/"+moi+"/"+annee);
    }
  
    public int getJour() {
        return jour;
    }
    public void setJour(int jour) {
        this.jour = jour;
    }
    public int getMoi() {
        return moi;
    }

    public void setMoi(int moi) {
        this.moi = moi;
    }
    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    

    
}
