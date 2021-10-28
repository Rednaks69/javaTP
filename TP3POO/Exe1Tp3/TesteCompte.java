/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe1Tp3;

public class TesteCompte {
    public static void main(String[] args) {
        
        Compte cpt1 = new Compte(101, 2000);
        cpt1.afficher();
        Compte cpt2 = new Compte(102, 1000);
        //System.out.println(" le solde du compte 2 est "+ cpt2.getSolde());
        cpt2.afficher();

        cpt1.deposer(1000);
        cpt2.retirer(500);
        cpt1.afficher();
        cpt2.afficher();
    }
}
