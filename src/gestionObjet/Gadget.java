package gestionObjet;

public class Gadget {

    private int valeur;

    public Gadget() {
        super();
    }

    public Gadget(int valeur) {
        this.valeur = valeur;
    }

    public String toString(){
        return " valeur du gadget : " + this.valeur;
    }

    public void incrementer(int value){
        this.valeur = this.valeur + value;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
