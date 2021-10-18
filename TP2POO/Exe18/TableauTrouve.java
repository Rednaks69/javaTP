/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe18;

import java.util.Scanner;

public class TableauTrouve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("donner la longeur du tableau A ");
        int n = input.nextInt();
        int[] A= new int[n];
       
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(int i = 0;i<A.length;i++){
            System.out.print("Remplisser la case du tableau A["+i+"] ");
            A[i] = input.nextInt();
        }
        System.out.print("donner la valeur de 'x' a rechercher  ");
        int x = input.nextInt();
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Le tableau remplie A est ");
        for(int i = 0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");

        for(int i= 0 ; i <A.length; i++){
            if(A[i]==x){
                System.out.println("l'indice de la premiere occurence 'i' est  "+i);
                break;
            }       
        }
        input.close();
    }
}
