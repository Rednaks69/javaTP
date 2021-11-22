
/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */

////////////////////////////////////////////////////////////////////////////////////////////

public interface SeriesSub extends Series {
     int getPrev();
     // une inteface peux heriter dune autre interface,
     // tout les dif dans linterface mere sont automatiquement appeller dans
     // linterface fille
}
