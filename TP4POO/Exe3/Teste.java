package Exe3;

public class Teste {
    public static void main(String[] args) {
        Son []listeSons = new Son[2];
        Mammifere []listeMammiferes = new Mammifere[2];
        Homme h = new Homme("Ali", "Bonjour", 20, true);
        Chien ch = new Chien("Snoopy", "Wouah!", 2,"caniches");

        listeSons[0] = h;
        listeSons[1] = ch;
        listeMammiferes[0] = h;
        listeMammiferes[1] = ch;
        
        for (int i=0; i<listeSons.length; i++)
        {
            // la méthode parle est polymorphe
            listeSons[i].parle();
            // la méthode vitesse est polymorphe
            listeMammiferes[i].vitesse();
        }
    }
}
