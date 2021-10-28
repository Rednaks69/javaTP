/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe5;

public class Unechaine {
    private String Str;
    private char[] array;
    private String strInverse="";

    public Unechaine(String str){
        this.Str=str;
        array=str.toCharArray();
       
    }
   
    String inverse(){
       for(int i = array.length-1 ;i>=0;i--){
        strInverse+=array[i];
       }  
       return strInverse;
    }
    
    boolean estPlindrome(){
        boolean estP=false;
        for( int i = 0 ; i < Str.length();i++){
            estP=(Character.toString(Str.charAt(i)).equals(Character.toString(strInverse.charAt(i)))? true : false);
        }
    return estP;
    }
}
