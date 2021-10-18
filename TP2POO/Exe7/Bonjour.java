/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe7;

import java.util.Scanner;


public class Bonjour {
     public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("entrer une chaine de caractaire suivie d'un nbr de repetition   ");
        String str = input.nextLine();
        
        int rep = Integer.parseInt(str.substring(str.length()-1));
        String[] parts = str.split(" ");
        
        for(int i = 0 ; i< rep ; i++){
            System.out.println(parts[0]+" "+ (i+1) +" fois");
        }
        input.close();
     }
}
