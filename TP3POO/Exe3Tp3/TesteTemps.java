/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe3Tp3;

public class TesteTemps {
    public static void main(String[] args) {
        Temps t = new Temps (10);
        t.affiche( );
        t = new Temps (10,12);
        t.affiche( );
        t = new Temps (10, 12, 45);
        t.affiche( );
    }
}
