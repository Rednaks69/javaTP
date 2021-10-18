/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe15;

import java.util.Scanner;

public class TableauZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("donner la longeur du tableau ");
        int N = input.nextInt();
        int[] tab= new int[N];
        for(int i = 0;i<tab.length;i++){
            System.out.print("Remplisser la case du tableau tab["+i+"]");
            tab[i] = input.nextInt();
        }

        System.out.println("Le tableau remplie est ");
        for(int i = 0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }
        for(int i = 0;i<tab.length;i++){
            if(tab[i]<0){
                tab[i]=0;
            }
        }
        System.out.println("");
        System.out.println("Le tableau modifier est ");
        for(int i = 0;i<tab.length;i++){ 
            System.out.print(tab[i]+" ");
        }
        input.close();

    }
}
