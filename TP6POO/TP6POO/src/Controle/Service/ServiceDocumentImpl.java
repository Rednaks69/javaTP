package Controle.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Controle.Interface.ServiceDocument;
import Modele.Dictionnaire;
import Modele.Document;
import Modele.Livre;

public class ServiceDocumentImpl implements ServiceDocument {

    private ArrayList<Document> documents = new ArrayList<>();

    @Override
    public void ajouterDoucment(Document document) {
        documents.add(document);
    }

    @Override
    public Document trouverDocument(int num) {
        int i;
        boolean k = false;

        for (i = 0; i < this.documents.size(); i++) {
            if (documents.get(i).getNumEnrg() == num) {
                k = true;
                break;
            }
        }
        if (k) {
            return this.documents.get(i);
        } else {
            return null;

            // return documents.stream().filter(e -> e.getNumEnrg() ==
            // num).findFirst().orElse(null);
        }
    }

    public String tousLesAuteurs() {
        String auteurs = " ";
        for (Document document : documents) {
            if (document instanceof Livre) {
                auteurs += ((Livre) document).getAuteur();
            }
        }

        return auteurs;
    }

    public ArrayList<Dictionnaire> tousLesDictionnaires() {
        ArrayList<Dictionnaire> dictionnaires = new ArrayList<>();
        for (Document document : documents) {
            if (document instanceof Dictionnaire) {
                dictionnaires.add((Dictionnaire) document);
            }
        }

        return dictionnaires;
    }

    public void sauvegarde(String path) throws IOException {
        FileWriter w = new FileWriter(path);
        w.append(documents.toString());
        w.close();

    }

}
