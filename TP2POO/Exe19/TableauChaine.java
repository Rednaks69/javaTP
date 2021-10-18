/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe19;

import java.util.Scanner;

public class TableauChaine {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("donner la longeur du tableau A ");
        int n = input.nextInt();
        String[] A= new String[n];
        int[] taille = new int[n];
        
        for(int i = 0;i<A.length;i++){
            System.out.println("Remplisser la case du tableau A["+i+"] ");
            A[i] = input.next();

        }
        System.out.println("Le tableau remplie A est ");
        for(int i = 0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");

        System.out.println("Le tableau Taille est ");
        for(int i = 0;i<A.length;i++){
            taille[i]=A[i].length();
            System.out.print(taille[i]+" ");
        }
        System.out.println("");
        input.close();
    
    }
}
