
/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */
////////////////////////////////////////////////////////////////////////////////////////////
abstract class vehicule {
    String name;
    String type;

    public vehicule(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return "this vehicule is called " + name + " and it's type is : " + type;
    }
}
