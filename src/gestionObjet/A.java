package gestionObjet;

public class A {

    private Gadget gadget = new Gadget();
    private int entier;

    Gadget getGadget(){
        return gadget;
    }

    public String toString(){
        return "Instance de A, " + " entier = " + entier + ", "+ gadget;
    }
}
