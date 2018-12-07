package gestionPile;

import java.util.ArrayList;

public class Pile1 {

    private ArrayList<Integer> liste = new ArrayList<>();

    public void empiler(int n) {
        liste.add(n);

    }

    public  int depiler() throws ExceptionPileVide {

        if(estVide())
            throw new ExceptionPileVide();
        else {
            return liste.remove(liste.size()-1);
        }
    }

    public boolean estVide() {
        return liste.size() < 0;
    }

}
