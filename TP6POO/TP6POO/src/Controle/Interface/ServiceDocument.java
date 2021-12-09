package Controle.Interface;

import Modele.Document;

public interface ServiceDocument {
    public void ajouterDoucment(Document document);

    public Document trouverDocument(int num);
}
