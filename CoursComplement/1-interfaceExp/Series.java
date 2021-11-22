
/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */
////////////////////////////////////////////////////////////////////////////////////////////

public interface Series {

    int getNext();
    // dif de getNext dans interface

    int MAX = 10;
    String ERRORMSG = " on ne peux pas aller plus que " + MAX;
    // On peux dif des variables dans une interface, ces variables sont public,
    // static et final

    // java 8 dans une interface les methodes(comme printItem) peuvent etre static
    // ou default
    default void printItem() {
        System.out.println("hello series");
        printMoreItems();
    }

    // java 9 a introduits les methodes privees dans linterface, du coup on peux les
    // utilisE dans linterface sans les appeler de lexterieur
    private void printMoreItems() {
        System.out.println("print more Stuff");
    }
}
