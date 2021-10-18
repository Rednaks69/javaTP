/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe9;

import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("donner un nbr positif de 3 chiffres max  ");
        int nbr = input.nextInt();
            if(nbr<1000){
                    int centaine = nbr/100;
                    System.out.println("le nbr de centaines est :  "+centaine);
                    int dizaine = (nbr%100)/10;
                    System.out.println("le nbr de dizaines est :  "+dizaine);
                    int unites = (nbr%10);
                    System.out.println("le nbr d'unites est :  "+unites);
            }else{
                System.out.println("le nbr que vous avaiz choisie est invalide");
            }
        input.close();
    }
}
