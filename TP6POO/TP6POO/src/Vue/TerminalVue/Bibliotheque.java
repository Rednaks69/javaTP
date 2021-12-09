package Vue.TerminalVue;

import java.io.IOException;

import Controle.Service.ServiceDocumentImpl;
import Modele.Document;

public class Bibliotheque {
    public static void main(String[] args) {
        Document d0 = new Document("ttttttt");
        Document d1 = new Document("titre", 100);
        Document d2 = new Document("titre2", 1001);
        ServiceDocumentImpl k = new ServiceDocumentImpl();
        System.out.println(d0.getNumEnrg());
        k.ajouterDoucment(d1);
        k.ajouterDoucment(d2);
        try {
            k.sauvegarde("sauvgarde.txt");
        } catch (IOException e) {
            return;
        }

    }
}
