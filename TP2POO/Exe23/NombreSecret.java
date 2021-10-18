/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe23;

import java.util.Scanner;

public class NombreSecret {
    public static void main(String[] args) {
        
        int Rnum= (int) (Math.random() * 11);
        boolean trouv=false;
        Scanner input = new Scanner(System.in);
        
        int nbressai = 1;

        while(!trouv&&nbressai<=5){
            System.out.println("Donner un nombre a trouver");
            int x = input.nextInt();
            if(x>Rnum){
                System.out.println("ce nombre est plus grand");
            }else if(x==Rnum){
                trouv=true;
                System.out.println("Bravo !! Le nombre a etais trouver");
                break;
            }else{
                System.out.println("ce nombre est plus petit"); 
            }
            nbressai++;
        }
        System.out.println(Rnum);
        input.close();
    }
}
