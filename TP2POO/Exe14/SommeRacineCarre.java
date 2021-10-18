/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe14;

import java.util.Scanner;

public class SommeRacineCarre {
    public static void main(String[] args) {
        int nbr =1;
        Scanner input = new Scanner(System.in);
            while(nbr >0){  
                System.out.print("Donner un nbr  ");
                nbr = input.nextInt();
                if(nbr!=0&&nbr>0){
                    System.out.println("La racine carre de "+nbr+" = "+Math.sqrt(nbr));
                }else{
                    System.out.println("Impossible de continuer cette operaton");
                    break;
                }      
            }
        input.close();
    }
}
