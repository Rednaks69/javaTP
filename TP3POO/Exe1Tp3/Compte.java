/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe1Tp3;

public class Compte {
    private float Solde;
    private int Numero;




public Compte( int num , float solde){
    this.Solde=solde;
    this.Numero=num;
}


void deposer( int montant){
Solde+=montant;
}

void retirer( float montant){
if ( montant<=Solde){
    Solde-=montant;
}else{
    System.out.println(" solde insufisant ");
}

}


void afficher(){
    System.out.println( "le numero du compte est: "+ Numero+", a le solde de :"+Solde );
}


    public int getNumero() {
        return Numero;
    }

    public float getSolde() {
        return Solde;
    }

    public void setSolde(Float solde) {
        this.Solde = solde;
    }

    public void setNumero(int numero) {
        this.Numero = numero;
    }

}
