package gestionTwin;

import com.sun.deploy.util.StringUtils;

public class twin {

    public static void main(String[] arg)  {

        String s1 = "moura";
        String s2 = "OUMARrr";

        if(fauxJumeaux(s1,s2))
            System.out.println(s1 + " et " + s2 + " sont des faux jumeaux .");
        else
            System.out.println(s1 + " et " + s2 + " ne sont pas des faux jumeaux.");

    }

    /*
        Vrai jumeaux : deux strings miroir
     */
    public static boolean vraiJumeaux (String s1, String s2){

        int taillechaine = s1.length();
        boolean miroir = false;

        if(taillechaine == s2.length()){
            for(int i=0; i< taillechaine; i++){
                Character charS1 = new Character(Character.toLowerCase(s1.charAt(i)));
                Character charS2 = new Character(Character.toLowerCase(s2.charAt(taillechaine - i-1)));

                if(!charS1.equals(charS2)){
                    miroir = false;
                    break;
                }
                miroir = true;
            }
        }
        return  miroir;
    }

    /*
        Faux jumeaux : c'est deux string ayant même taille et même caractères
     */
    public static boolean fauxJumeaux (String s1, String s2){

        int taillechaine = s1.length();
        boolean miroir = true;

        if(taillechaine == s2.length()){
            char[] chars1 = s1.toCharArray();

            for(char car : chars1) {
                Character lowerCaseCar = new Character(Character.toLowerCase(car));
                long occCar1 = s1.toLowerCase().chars().filter(c->c==lowerCaseCar).count();
                long occCar2 = s2.toLowerCase().chars().filter(c->c==lowerCaseCar).count();

                if(occCar1 != occCar2){
                    miroir = false;
                    break;
                }
            }
        }
        return  miroir;
    }
}
