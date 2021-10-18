/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe21;

import java.util.Scanner;

public class TrouverNbCaractere {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Saisir une chaine de caracteres : ");
            String Str = input.nextLine();
            System.out.print("Entrer un caracteres : ");
            String Ch = input.nextLine();
            int s = 0;
            for(int i =0 ; i< Str.length();i++){
               if(Character.toString(Str.charAt(i)).equals(Ch)){
                s+=1;
               }
            }
            input.close();
            System.out.println("on trouve "+Ch+", "+s+" fois dans : '"+Str+"'");
            
    }
}
