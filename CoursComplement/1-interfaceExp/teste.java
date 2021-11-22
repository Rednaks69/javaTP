/////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Complent du cours (+) Serie complementaire
 * 
 * 
 * Matiere: POO-Java / Numero du TP : Complement / Classe(s): GLSI-2 / Anne
 * Universitaire : 2021-2022 / ProposE par : Azer Hasnaoui
 */
////////////////////////////////////////////////////////////////////////////////////////////

/* 
1- def dinterface et implimentation des methodes
2- references des interfaces 
3- heritage dune interface
4- variables dans une interface
5- methode dans une interface (static, default, private)
*/

class teste {
    public static void main(String[] args) {
        // 1- Definition de la fct getNext dans l'interface Serie et implementation ce
        // fait dans chaque implementation de l'interface

        Bytwo bytwoObject = new Bytwo();
        // bythree bythreeObject = new bythree();

        /*
         * for (int i = 0; i <5; i++) { System.out.println(bytwoObject.getNext()); // a
         * fct getNext def dans linterface et implementer dans bytwo
         * System.out.println(bythreeObject.getNext()); // a fct getNext def dans
         * linterface et implementer dans bythree
         * System.out.println(bythreeObject.getPrev()); // a fct getNext NEST PAS def
         * dans linterface MAIS implementer dans bytwo (ne fctionne pas) }
         */

        /*
         * 2,3-*****Inetface comme reference*****
         */
        Series obSeries;
        SeriesSub obSeriesSub = bytwoObject;
        for (int i = 0; i < 6; i++) {
            obSeries = bytwoObject;
            obSeriesSub = bytwoObject;
            System.out.println(obSeries.getNext());

            /*
             * System.out.println(((Bytwo)obSeries).getPrev()); // la reference ne fctionne,
             * que si le resulta est caster dans le type dObject Ou appeller part lObjetc
             * directement System.out.println(obSeriesSub.getPrev());
             * System.out.println(bytwoObject.getPrev()); obSeries=bythreeObject;
             * System.out.println(obSeries.getNext());
             */
        }

        /*
         * 4,5- *****Static and defaut methodes Variables*****
         */

        obSeriesSub.printItem(); // la reference ne fctionne si la fct printstuff est en default,
                                 // Si printStuff est en static alors faux appeller Series.printStuff comme une
                                 // methodes static

        /*
         * // bytwoObject.printItem(); // bythreeObject.printItem();
         */
    }

}