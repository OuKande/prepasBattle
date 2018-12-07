package gestionTableau.gestionstatic;

import java.util.Arrays;
import java.util.OptionalInt;

public class OpTabInt {

    static int somme(int[] tab){

        int somme = 0;
        for (int n : tab){
            somme = somme +n;
        }
        return  somme;
    }

    static int indiceMax(int[] tab){

        int indiceMax = -1;

        if(tab != null) {
            OptionalInt maxvalue = Arrays.stream(tab).max();
            indiceMax = Arrays.asList(tab).indexOf(maxvalue);
        }
        return indiceMax;
    }

    static int[] ajoute(int[] tab, int n){

        int[] tmp = new int[tab.length + 1];
        tmp = Arrays.copyOf(tab, tab.length + 1);
        tmp[tab.length] = n;
        return tmp;
    }

    static void ecrire(int[] tab){

        System.out.println("Le tableau : " + Arrays.toString(tab));
    }
}
