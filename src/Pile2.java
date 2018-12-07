import gestionPile.ExceptionPileVide;

import java.util.ArrayList;

public class Pile2 {

    private Maillot debut;

    public void empiler(int n) {
        debut = new Maillot(n,debut);
    }

    public  int depiler() throws ExceptionPileVide {

        Integer valueDepile = null;

        if(estVide())
            throw new ExceptionPileVide();
        else {
            valueDepile = debut.getValue();
            debut = debut.getSuivant();
        }
        return valueDepile;
    }

    public boolean estVide() {
        return (debut == null);
    }

}

class Maillot {

    private int value;
    private Maillot suivant;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Maillot getSuivant() {
        return suivant;
    }

    public void setSuivant(Maillot suivant) {
        this.suivant = suivant;
    }

    public Maillot(int n) {
        value=n;
        suivant=null;
    }

    public Maillot(int n, Maillot s){
        value=n;
        suivant=s;
    }

}