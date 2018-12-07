package gestionTableau.gestionstatic;


import java.util.Arrays;

public class EssaiOp {

    public static void main(String[] args) {

        int[] tableau = {3,-8,14,4};

        OpTabInt.ecrire(tableau);
        System.out.println(OpTabInt.somme(tableau));
        System.out.println(OpTabInt.indiceMax(tableau));
        System.out.println(" Tableua augmenté est : " + Arrays.toString(OpTabInt.ajoute(tableau, 5)));

    }

}
