package jeux;

public class JeuxPasDanse {

    public static void main(String[] arg)  {

        int nbTour = 5;

        System.out.println( jeu(nbTour) + " pas de danses  pour " + nbTour + " tours");

    }

    private static int jeu(int nbTour) {

        int pas = 0;

        if(nbTour == 0)
            pas = 0;
        else if (nbTour == 1)
            pas = 1;
        else if (nbTour == 2)
            pas = -2;
        else {
            int pasPrecedentPrecedent = 1;
            int pasPrecedent = -2;

            for(int i = 3; i <= nbTour; i++){
                pas = pasPrecedent - pasPrecedentPrecedent;
                int tmpPas = pasPrecedentPrecedent;
                pasPrecedentPrecedent = pasPrecedent;
                pasPrecedent = pas;
            }
        }



        return pas;
    }

}
