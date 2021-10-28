/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe6;
public class javanais{

    private String Str;
    private String javanais;
    private String Francais;
    
    public javanais(String str){
        this.Str=str;
    }

    String versJavanais(){
        javanais = Str.replace("a","ava");
    return javanais;
    }
    
    
    String deJavanais(){
        Francais = Str.replace("ava","a");
    return Francais;
    }
}