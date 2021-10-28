/////////////////////////////////////////////////////////////////////////////////////////////
//// Matiere: POO-Java                                                                   ////
//// Numero du TP : TP3                                                                  ////
//// Classe(s): GLSI-2                                                                   ////
//// Anne Universitaire : 2020-2021                                                      ////
//// ProposE par : Azer Hasnaoui                                                         ////
/////////////////////////////////////////////////////////////////////////////////////////////

package Exe3Tp3;

public class Temps {

    private int heures;

    private int minutes;
    private int seconde;

    public Temps(int heures){
        this.heures=heures;
    }
    public Temps(int heures, int minutes){
        this.heures=heures;
        this.minutes=minutes;
    }

    public Temps(int heures, int minutes , int secondes){
        this.heures=heures;
        this.seconde=secondes;
        this.minutes=minutes;
    }
    
    public void affiche(){
        System.out.println("il est " +heures+" heures "+minutes+" minutes "+seconde+" seconde");
    }
    
    
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconde() {
        return seconde;
    }

    public void setSeconde(int seconde) {
        this.seconde = seconde;
    }
    public int getHeures(){
        return heures;
    }
    public void setHeures(int heures){
        this.heures=heures;
    }



}