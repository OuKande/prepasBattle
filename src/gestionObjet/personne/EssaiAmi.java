package gestionObjet.personne;

public class EssaiAmi {

    public static void main(String[] arg) {

        Personne personneSeule, ami1, ami2;

        personneSeule = new Personne("kande");
        ami1 = new Personne("Diallo");
        ami2 = new Personne("Balde", ami1);
        ami1.setAmi(ami2);

        System.out.println(personneSeule);
        System.out.println(ami1);
        System.out.println(ami2);

    }
}
