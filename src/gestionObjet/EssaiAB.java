package gestionObjet;

public class EssaiAB {

    public static void main(String[] arg) {
        A a = new A();
        B b = new B(a.getGadget());

        System.out.println(a);
        System.out.println(b);
        b.incrementer(5, 10);
        System.out.println("Après incrémentation : ");
        System.out.println(a);
        System.out.println(b);

    }
}
