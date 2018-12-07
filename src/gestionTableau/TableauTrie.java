package gestionTableau;

import java.util.Arrays;

public class TableauTrie {

    private int[] tabTrie;
    private int taille = 0;
    private int nbInseres = 0;

    public TableauTrie() {
        super();
    }

    public TableauTrie(int taille) {
        this.tabTrie = new int[taille];
        this.taille = this.tabTrie.length;
    }

    void inserer(int entier) {

        if(nbInseres < taille){
            this.tabTrie[0] = entier;
        }
        else {
            int[] tabTmp = new int[nbInseres+1];

            for(int j=0; j < taille; j++)
                tabTmp[j] = tabTrie[j];
            tabTmp[nbInseres] = entier;
            this.tabTrie = tabTmp;
            this.taille++;
        }

        nbInseres++;
       Arrays.sort(this.tabTrie);
    }

    void supprimer(int entier){

        int[] tabTmp;

        for(int i=0; i < tabTrie.length; i++){
            if(entier == tabTrie[i]){
                tabTmp = new int[taille-1];
                for(int j=0; j < i; j++)
                    tabTmp[j] = tabTrie[j];
                for(int k=i+1; k < taille; k++)
                    tabTmp[k-1] = tabTrie[k];
                this.tabTrie = tabTmp;
                this.nbInseres--;
                this.taille--;
            }
        }
    }

    @Override
    public String toString() {
        return "TableauTrie{" +
                "tabTrie=" + Arrays.toString(tabTrie) +
                ", nbInseres=" + nbInseres +
                '}';
    }

    void afficher() {
        System.out.println(" la liste trié est : " + Arrays.toString(this.tabTrie));
    }

}
