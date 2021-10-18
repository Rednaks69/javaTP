/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe4;

import java.util.Scanner;

public class Annee {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int Annee;
        System.out.println("Enter une annee");
        Annee=input.nextInt();
        
            if( Annee % 4 == 0 && Annee % 100!=0){
            System.out.println(" c'est une annee bissextille");
            }else if (Annee % 400 == 0){
            System.out.println(" c'est une annee bissextille");
            }else{
            System.out.println(" ce n'est pas une annee bissextille");
            }
        input.close();

    }
}
