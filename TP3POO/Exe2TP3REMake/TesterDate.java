/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe2TP3REMake;

import java.util.Scanner;



class TesterDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("donner un jour  ");
        
        int jour = input.nextInt();
        System.out.print("donner un mois  ");
        int mois = input.nextInt();
        System.out.print("donner une annee  ");
        int annees = input.nextInt();
        Date d1 = new Date(jour, mois, annees);
        d1.afficher();
        int nbr =d1.nombreJours();
        System.out.println(nbr);
        d1.lendemain();
        d1.afficher();

        
        input.close();
    }

    
}
