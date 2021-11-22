
/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */
////////////////////////////////////////////////////////////////////////////////////////////

public class bythree implements Series {
    int val;

    public bythree() {
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    public void printItem() {
        System.out.println("in the bythree");
    }
}
