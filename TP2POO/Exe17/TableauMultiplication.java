/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe17;

import java.util.Scanner;

public class TableauMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("donner la longeur du tableau A ");
        int n = input.nextInt();
        int[] A= new int[n];
        System.out.print("donner la longeur du tableau B ");
        int p = input.nextInt();
        int[] B= new int[p];
        int Clength=((n>p)? n : p);
        int[] C = new int[Clength];
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(int i = 0;i<A.length;i++){
            System.out.print("Remplisser la case du tableau A["+i+"] ");
            A[i] = input.nextInt();
        }
        System.out.println("Le tableau remplie A est ");
            for(int i = 0;i<A.length;i++){
                System.out.print(A[i]+" ");
            }
        System.out.println("");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
        for(int i = 0;i<B.length;i++){
            System.out.print("Remplisser la case du tableau B["+i+"] ");
            B[i] = input.nextInt();
        }
        System.out.println("Le tableau remplie B est ");
        for(int i = 0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println("");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    
        for(int i = 0;i<C.length;i++){
                C[i]=A[i%A.length]*B[i];
            }
        
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////         
        System.out.println("Le tableau resultant C est ");
        for(int i = 0;i<C.length;i++){
            System.out.print(C[i]+" ");
        }
      input.close();
    }
}
