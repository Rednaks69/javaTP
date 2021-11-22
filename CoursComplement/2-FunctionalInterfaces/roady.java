
/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */
////////////////////////////////////////////////////////////////////////////////////////////
public class roady extends vehicule {
    String roady;

    public roady(String name, String type, String raody) {
        super(name, type);
        this.roady = raody;
    }

    @Override
    public String toString() {
        return super.toString() + " it goes on " + roady;
    }

}
