package gestionTableau;

public class TestTableauTrie {

    public static void main(String[] arg)  {

        TableauTrie  tableauTrie = new TableauTrie(3);

        tableauTrie.inserer(2);
        tableauTrie.inserer(5);
        tableauTrie.inserer(1);
        tableauTrie.inserer(8);
        tableauTrie.inserer(4);
        tableauTrie.supprimer(2);
        tableauTrie.supprimer(8);
        tableauTrie.afficher();

    }
}
