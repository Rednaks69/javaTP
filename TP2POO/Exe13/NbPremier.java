/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe13;

import java.util.Scanner;

public class NbPremier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("donner un chiffre positif   ");
        int nbr = input.nextInt();
        boolean premier = false;
        
        for(int j = 2; j <=nbr ; j++){
            for(int i = 2; i <j ; i++){
                if(j%i==0) {
                    premier = false;
                    break;
                }
                if(j%i!=0) premier = true;    
            }

            if(premier) {
                System.out.println("-> "+j +": est premier");
            }
        } 
        input.close(); 
    }
}
