/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe20;

import java.util.Scanner;

public class SuiteChaine {
    public static void main(String[] args) {
        int i =1;
        Scanner input = new Scanner(System.in);
        while(true){
            
            
            System.out.print("Saisir Chain numero "+i+": ");
            String Str = input.nextLine();
            
            System.out.println("chaine numero "+i+": "+Str);
            i++;
            if(Str.equals("end")){
                System.out.println("Fin du programme");
                
                break;
            }
            
        }
        input.close();    
    }    
}