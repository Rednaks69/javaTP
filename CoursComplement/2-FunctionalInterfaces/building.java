/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */
////////////////////////////////////////////////////////////////////////////////////////////
abstract class building implements Decorable {
    String name;
    String type;

    public building(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return "this building have name of " + name + " which type is " + type;
    }
}
