/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe5;

import java.util.Scanner;

public class TesteChaine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("entrer la chaine a tester  ");
        String reg = input.nextLine();
        Unechaine str = new Unechaine(reg);
        System.out.println(reg);
        String inv = str.inverse();
        System.out.println(inv);
        System.out.println(str.estPlindrome());
        input.close();
    }
}
