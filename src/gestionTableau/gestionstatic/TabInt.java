package gestionTableau.gestionstatic;

import java.util.Arrays;
import java.util.OptionalInt;

public class TabInt {

    int[] table;

    public TabInt(String[] strings) {

        this.table = Arrays.asList(strings).stream().mapToInt(Integer::parseInt).toArray();
    }

    public TabInt(int[] table) {
        this.table = table;
    }

    public int longueur(){
        return this.table.length;
    }

    public int somme(){
        return Arrays.stream(this.table).sum();
    }

    public int indiceMax(){

        int indiceMax = -1;

        if(this.table != null) {
            OptionalInt maxvalue = Arrays.stream(this.table).max();
            indiceMax = Arrays.asList(this.table).indexOf(maxvalue);
        }
        return indiceMax;
    }

    public int[] ajoute(int n){

        int[] tmp = new int[this.table.length + 1];
        tmp = Arrays.copyOf(this.table, this.table.length + 1);
        tmp[this.table.length] = n;
        return tmp;
    }

    public void ajouteEtModifie(int n){

        this.table = ajoute(n);
    }

    @Override
    public String toString() {
        return "TabInt{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}
