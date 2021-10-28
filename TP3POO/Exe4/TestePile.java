/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe4;

import java.util.Scanner;

public class TestePile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entrer la taille de la pile");
        int n = input.nextInt();
        Pile p1 = new Pile(n);
        p1.affiche();

        for(int i = 0; i<n;i++){
            System.out.print("entrer l'entier  "+(i+1)+" a empiler  ");
            p1.enpile(input.nextInt());
        }
        

        p1.affiche();
        int depiler = p1.depile();
        System.out.println("valuer depiler "+depiler);
        p1.affiche();
        depiler = p1.depile();
        System.out.println("valuer depiler "+depiler);
        p1.affiche();
        depiler = p1.depile();
        System.out.println("valuer depiler "+depiler);
        input.close();
    }
}
