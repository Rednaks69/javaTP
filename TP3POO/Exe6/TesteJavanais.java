/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe6;

public class TesteJavanais {
    public static void main(String[] args) {
        javanais j;
        j = new javanais ("ali, sais-tu parler Javanais? ");
        System.out.println ("en javanais : " + j.versJavanais() );
        j = new javanais ("je savais pavarler du Javavavanavais ");
        System.out.println ("en français : " + j.deJavanais( ));
        
    }
}
