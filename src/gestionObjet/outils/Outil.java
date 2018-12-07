package gestionObjet.outils;

public class Outil {

    private  Bricoleur bricoleur;
    private  int puissance;

    Outil(Bricoleur _b, int _puissance) {
        this.bricoleur = _b;
        this.puissance = _puissance;
    }

    public int faire(){

        int resultat = 1;
        int val = bricoleur.getTaille();

        for (int i = 0; i < puissance; i++)
            resultat *= val;
        return resultat;
    }
}
