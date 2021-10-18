/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe6;

import java.util.Scanner;

public class Jour {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("entrer le nbr du jour :   ");
        int jour= input.nextInt();
        switch(jour){
            case 1 : System.out.println("c'est lundi");
            break;
            case 2 : System.out.println("c'est mardi");
            break;
            case 3 : System.out.println("c'est mercredi");
            break;
            case 4 : System.out.println("c'est jeudi");
            break;
            case 5 : System.out.println("c'est vendredi");
            break;
            case 6 : System.out.println("c'est samedi");
            break;
            case 7 : System.out.println("c'est dimanche");
            break;
        }
        input.close();
    }
}
