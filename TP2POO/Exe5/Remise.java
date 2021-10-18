/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe5;

import java.util.Scanner;

class Remise {
public static void main(String[] args) {
   Scanner input = new  Scanner(System.in);
   System.out.print("entrer un prix :   ");
   int prix= input.nextInt();
   int remise;
   if (prix < 50){
    remise = 20 ;
   }else if(prix<150&&prix>=50){
    remise = 40;
   }else{
       remise = 60;
   }
   System.out.println("Vous avez une remise de : "+remise+"%");
   input.close(); 


}
}