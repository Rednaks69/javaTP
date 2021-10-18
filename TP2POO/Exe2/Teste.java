/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe2 ; 
import java.util.Scanner;
public class Teste {
public static void main(String args[]) {

Scanner input_1 = new Scanner(System.in);
System.out.print(" Quel est votre nom ");
String nom = input_1.nextLine(); // chaine de caractaire, sur une seule ligne

System.out.print(" Entre votre age ");
int age = input_1.nextInt(); // entier sur une seule ligne 


System.out.println(" Bienvenu " + nom + "!");
System.out.print(" Vous avez  " + age + " ans.");
input_1.close();
}
}

