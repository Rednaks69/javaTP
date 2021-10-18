/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe3;

import java.util.Scanner;

public class Somme {
    
   public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
    float x, y ; 
    System.out.println("Enter un nbr X");
    x=input.nextFloat();

    System.out.println("Enter un nbr Y");
    y=input.nextFloat();

    System.out.println(" la somme est : "+ (x+y));
      input.close();
   }

}
