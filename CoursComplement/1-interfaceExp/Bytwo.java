
/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */
////////////////////////////////////////////////////////////////////////////////////////////
//**** implentation dune interface fille ****

////////////////////////////////////////////////////////////////////////////////////////////
public class Bytwo implements SeriesSub {
    int val;

    public Bytwo() {
        val = 0;
    }

    /*
     * La surcharge de limplimentation dune classe peux etre appeller de linterface
     * qui def cette methodes ou dune interface fille.
     * 
     * On peux appeller les vaidables de linterface dans une classe qui implimente
     * cette meme interface ou une interface fille a cette dernierre tout les
     * variables sont public, static et final
     */

    @Override
    public int getNext() {
        if (val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 2;
        }
        return val;
    }

    /*
     * la fct (getPrev) suivante est def dans linterface fille et la fct (getNext)
     * est def dans linterface mere
     */
    public int getPrev() {
        val -= 2;
        return val;
    }

    /*
     * la surcharge dune fct default ou static implimenter dans une interface ne
     * change en rien la surcharge de cette meme fct dans la classe qui implimente
     * cette meme interface ou sa intertface fille
     */
    public void printItem() {
        System.out.println("in the bytwo");
    }
}
