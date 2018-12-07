package gestionArbreBinaire.abr;

import gestionArbreBinaire.Noeud;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ABR {

    private Noeud racine;

    public ABR() {
        this.racine = null;
    }

    public ABR(String nomFichier) {
            construire(nomFichier);
    }

    public void construire(String nomFichier) {
        Scanner lecteur = null;
        try {
            lecteur = new Scanner(new File(nomFichier));
        } catch (FileNotFoundException e) {
            System.out.println(" Fichier non trouver " + e);
        }

        while(lecteur.hasNext())
            inserer(lecteur.next());
    }

    private void inserer(String mot, Noeud rac) {

    }

    private void inserer(String mot) {

    }
}
