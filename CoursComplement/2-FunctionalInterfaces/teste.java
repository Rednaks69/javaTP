/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */
////////////////////////////////////////////////////////////////////////////////////////////

public class teste {
    public static void main(String[] args) {
        casteles casteles = new casteles("rock", "casteles");
        System.out.println("");
        System.out.println(casteles);
        building house = new houses("white", "house");
        System.out.println(house);
        ship ship = new ship("blackpearl", "ship");
        System.out.println(ship);
        roady car = new cars("polo", "car", "road");
        System.out.println(car);

        System.out.println("------------------------------------------------------");
        Decorable objDecorable = casteles; // passage par reference

        System.out.println(house.decorate());
        System.out.println(casteles.decorate());
        System.out.println(objDecorable.colorate());
        objDecorable = house;
        System.out.println(objDecorable.colorate());
        System.out.println("------------------------------------------------------");
        // flyable objFlyable = (flyable) house; // cast object

        System.out.println(ship.fly());
        System.out.println(casteles.fly());
        System.out.println("");

        // System.out.println(objFlyable.fly());
        /*
         * si la class n'implemente pas linterface on ne peux pas fare un passage par
         * reference
         */
    }
}
