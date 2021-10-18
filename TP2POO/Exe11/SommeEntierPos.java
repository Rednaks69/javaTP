/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe11;

import java.util.Scanner;

public class SommeEntierPos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donner un nbr N :  ");
        int n = input.nextInt();
        int s = 0;
        for( int i = 0 ; i < n ; i++){
            System.out.print("Donner le nbr "+(i+1)+" :  ");
            int nbrpos = input.nextInt();
           if(nbrpos>0) s+=nbrpos;
           else System.out.println("Le nbr "+(i+1)+" est invalide  ");
        }
        System.out.println("La Somme total est :  "+ s);
        input.close();
    }
}
