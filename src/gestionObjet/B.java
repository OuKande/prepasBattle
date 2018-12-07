package gestionObjet;

public class B {

    private Gadget gadget;
    private int entier;

    public B(Gadget gadget) {
       this.gadget = gadget;
    }

    public String toString() {
        return "Instance de B, " + " entier = " + entier + ", "+ gadget;
    }

    public void incrementer(int value1, int value2){
        this.entier = this.entier + value1;
        this.gadget.incrementer(value2);
    }
}
