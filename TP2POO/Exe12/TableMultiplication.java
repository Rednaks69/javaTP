/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe12;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("donner un chiffre positif   ");
        int nbr = input.nextInt();
        if (nbr <11 && nbr>=0){
            for(int i = 1 ; i < 10; i++){
               
                System.out.println(nbr +"X" + i +" =  "+(nbr*i));
            }
        }else System.out.println("nombre invalide");
        input.close();
    }
}
