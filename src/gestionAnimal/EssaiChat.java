package gestionAnimal;

import java.util.Random;

public class EssaiChat {

    private static Random rand = new Random();

      public static Animal tirage (){
        return (Math.abs(rand.nextInt()) % 2 == 0 ? new Chien() : new Chat());
    }

    public static void main(String[] arg) {
        tirage().action();
    }
}
