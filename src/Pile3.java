import gestionPile.ExceptionPileVide;

import java.util.ArrayList;

public class Pile3 {

    private int taille = 3;
    private int increment = 2;
    private int[] tableau = new int[taille];
    private int hauteur = 0; // nombre d'entiers rangés

    public void empiler(int n) {
        if (hauteur == taille)
        {
            taille = taille + increment;
            int[] tableauBis = new int[taille];
            for (int i = 0; i < hauteur; i++)  tableauBis[i] = tableau[i];
            tableau = tableauBis;
        }
        tableau[hauteur] = n;
        hauteur++;
    }

    int depiler() throws ExceptionPileVide {
        int cle;

        if (estVide()) throw new ExceptionPileVide();
        hauteur--;
        return  tableau[hauteur];
    }

    boolean estVide() {
        return hauteur == 0;
    }
}
