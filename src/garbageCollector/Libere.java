package garbageCollector;

public class Libere {

    public static void main(String[] arg)
    {
        int [][] tableau = new int[3][];
        int i;

        System.out.println("Le maximum : " + Runtime.getRuntime().maxMemory());
        System.out.println("Le total   : " + Runtime.getRuntime().totalMemory());
        System.out.println("Libre      : " + Runtime.getRuntime().freeMemory());
        System.out.println();
        for (i = 0; i < 3; i++)
        {
            tableau[i] = new int[400000];
            System.out.println("i = " + i + ", libre : " + Runtime.getRuntime().freeMemory());
        }
        System.gc();
        System.out.println();
        System.out.println("Apres liberation, libre : " + Runtime.getRuntime().freeMemory());
        System.out.println();
        for (i = 0; i < 3; i++)
        {
            tableau[i] = null;
            System.gc();
            System.out.println("i = " + i + ", libre : " + Runtime.getRuntime().freeMemory());
        }
    }
}
