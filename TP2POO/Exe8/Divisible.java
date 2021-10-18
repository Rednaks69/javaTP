/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe8;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donner un nbr A  ");
        int A = input.nextInt();
        System.out.print("Donner un nbr B  ");
        int B = input.nextInt();
        boolean Divisible =((A%B)==0? true: false);
        if(Divisible)System.out.println("divisable");
        else System.out.println("Non divisable");
        input.close();
    }
}
