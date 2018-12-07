package gestionObjet.outils;

public class Bricoleur {

    private int taille;
    private Outil outil;

    Bricoleur(int puissance, int taille) {
        this.outil = outil;
        this.taille = taille;

        this.outil = new Outil(this, puissance);
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Outil getOutil() {
        return outil;
    }

    public void setOutil(Outil outil) {
        this.outil = outil;
    }

    void bricoler() {
        System.out.println(outil.faire());
    }
}
