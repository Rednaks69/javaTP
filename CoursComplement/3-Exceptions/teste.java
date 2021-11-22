/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */
////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// C'est quoi une exeption ? 
// => Une exepetion est une erreure qui occure a l'execution 
// (execution != compilation , c.a.d il se peux que votre syntaxe est correct main lors de lexecution une erreure occure)
// exp: tableaux depasser(ArrayOutOfBoundsException), division dun nbr par zero ou bien echec une connection avec une base donnees 
// 1-Exeception hierarchy
// 2-Try & catch
// 3-Unhandled exeption
// 4-Finally (methode)
// 5-Manually throw exceptions
// 6- create your own exception
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class teste {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 2
    /////////////////

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////////
        int[] num = new int[5]; /// 1
        try {
            // num[10]=24;
            // traitement dans le try
            errorMethode(num);
        } catch (Exception e) { // } ///
            // }catch((type de lexception) (Nom de lexception)){
            System.out.println("2end try"); // traitement dans le catch ///
            // handle exception // retour au programme ///
            System.out.println("in the catch");
            System.out.println(e);
        }
        System.out.println("app resume");
    }

    public static void errorMethode(int[] num) {
        num[10] = 24;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 3 expemple 1
    ///////////////

    // public static void main(String[] args) {
    // int[] num = new int[5];

    // try {
    // System.out.println("first try");
    // num[10]=24;
    // System.out.println("2end try");
    // }catch(ArrayIndexOutOfBoundsException ex){
    // System.out.println("in the first catch");
    // }
    // catch (Exception e) {
    // System.out.println("in the 2end catch");
    // }

    // System.out.println("app resume");
    // }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 3 exemple 2
    //////////////////

    // public static void main(String[] args) {
    // int[] numo = {1,9,6,8};
    // int[] divi = {1,3,0,2};
    // for (int i = 0; i < divi.length; i++) {
    // //try {
    // System.out.println(numo[i]/divi[i]);
    // // }catch(ArithmeticException ex){
    // // System.out.println("interdiction de division sur zero");
    // // }
    // }

    // }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 4
    // public static void main(String[] args) {
    // int[] num = new int[5];

    // try {
    // System.out.println("first try");
    // num[10]=24;

    // }
    // // catch (Exception e) {
    // // System.out.println("in the catch");
    // // // return; // return ne change pas le faite que finally sexecute
    // // }
    // finally{ // finally block sexecute peut importe lexception
    // System.out.println("in finally");
    // }

    // System.out.println("App resume");
    // }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 5
    // public static void main(String[] args) {

    // try {
    // throw new ArithmeticException();
    // } catch (ArithmeticException e) {
    // System.out.println(e);
    // }
    // }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 6
    // public static void main(String[] args) {
    // int n = 0;
    // try {
    // if ((n > 1) && (n < 10)) {
    // System.out.println(" Correct");
    // } else {
    // throw new InvalidNumberException("nbr invalide");
    // }
    // } catch (InvalidNumberException e) {
    // System.out.println(e.getMessage());
    // }
    // }
}
