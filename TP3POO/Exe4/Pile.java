/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe4;



public class Pile {

    private int[] pile;
    
    private boolean pilePleine=false;
    private boolean pileVide=false;

    public Pile(int taille){
        pile= new int[taille];
        for( int i = 0 ; i< pile.length;i++){
            pile[i]=0;
        }
    }
   

    private boolean pilePleine(){
            if(pile[pile.length-1]!=0){
                pilePleine=true;
            }
        return pilePleine;
    }

    private boolean pileVide(){
            if(pile[0]==0){
                pileVide=true;
            }
        return pileVide;
    }


    public void enpile(int e){
        if(!pilePleine()){
            for(int i = pile.length-1;i>0;i--){
                pile[i]=pile[i-1];
                
            }
            pile[0]=e;
            pileVide=false;
        }else{
            System.out.println("pile pleine ");
        }
    }
    public int depile(){
        int dep=-1;
        if(!pileVide()){
            for (int i = 0 ; i <pile.length-1;) {
                if(pile[(pile.length-1)-i]==0){
                    dep=pile[(pile.length-1)-(i+1)];
                    pile[(pile.length-1)-(i+1)]=0;
                    break;
                }else{
                    dep=pile[pile.length-1];
                    pile[pile.length-1]=0;
                    break;
                }
            }
        }
    return dep;
    }

    public void affiche(){
        if(!pileVide()){
            for(int i = 0; i<pile.length;i++){
                System.out.println(pile[i]);
            }
        }else{
            System.out.println("pile vide");
        }
    }
    

}
