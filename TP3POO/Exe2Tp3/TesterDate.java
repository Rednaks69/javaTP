/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe2Tp3;

import java.util.Scanner;

public class TesterDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("donner un jour");
        int jour = input.nextInt();
        System.out.println("donner un mois");
        int mois = input.nextInt();
        System.out.println("donner une annee");
        int annees = input.nextInt();
        Date d1 = new Date(jour, mois, annees);
        d1.affiche();
        d1.nombreJours();
        d1.dateValide();
        d1.lendemain();
        d1.affiche();
        input.close();
    }
}
