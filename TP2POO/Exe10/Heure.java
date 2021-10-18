/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////         
//// Numero du TP : TP2                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe10;

import java.util.Scanner;

public class Heure {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("donner un nbr pour les secondes  ");
    int secondes=input.nextInt();
    System.out.print("donner un nbr pour les minutes  ");
    int minutes=input.nextInt();
    System.out.print("donner un nbr pour les heures  ");
    int heures=input.nextInt();
    
    if(secondes<60&&minutes<60&&heures<24){
        
        System.out.println(heures+":"+minutes+":"+secondes);

        if(heures==23&&minutes==59&&secondes==59){
            heures=0;
            minutes=0;
            secondes=0;
        }else if (minutes==59&&secondes==59){
            heures++;
            minutes=0;
            secondes=0;
        }else if (secondes==59){
            minutes++;
            secondes=0;
        }else{
            secondes++;
        }

        System.out.println(heures+":"+minutes+":"+secondes);

    }else {
        System.out.println("heures invalide");
    }
    input.close();
}
}
