/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe22;

import java.util.Scanner;

public class TrouveNBcaratereTab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Saisir la taille du tableau : ");
        int n = input.nextInt();
           
        if(n<50){
            String[] TabStr = new String[n];

            for(int i = 0;i<TabStr.length;i++){
                System.out.print("Saisir une chaine de caracteres : ");
                String Str = input.next();
                TabStr[i]=Str;
            }
            
            System.out.print("Entrer un caracteres : ");
            String Ch = input.next();
            int sTotal = 0;

            for(int j =0; j<TabStr.length;j++){
                int s = 0;
                for(int i =0 ; i< TabStr[j].length();i++){
                    if(Character.toString(TabStr[j].charAt(i)).equals(Ch)){
                        s+=1;
                    }
                    }
                    System.out.println("on trouve "+Ch+", "+s+" fois dans : '"+TabStr[j]+"'");
                sTotal+=s;
            }
            
            System.out.print("on trouve au Total "+Ch+", "+sTotal+" fois dans : "); 

            for( int i =0 ; i <TabStr.length;i++){  
                System.out.print(" "+"'"+TabStr[i]+"'");
            }

        }else{
            System.out.println("le nombre que vous avez choisie et tres grand");
        }
        input.close();   
    }
}
