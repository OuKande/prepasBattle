package gestionDouble;

import java.text.DecimalFormat;

public class TronqueDouble {

    public static void main(String[] arg)  {

        String doubleString = "4.123456789";
        double doubl = -004.123456789;
        int nbDecimales = 0;

        System.out.println( tronquerAvecApi(doubl,nbDecimales));

    }

    private static String tronquer (String doubl, int nbDecimales) {

        char point = '.';
        if(!doubl.isEmpty()){
            for(int i=0; i< doubl.length(); i++){
                char car = doubl.charAt(i);
                if(point==car) {
                    if(nbDecimales==0)
                        return  doubl.substring(0,i);
                    return  doubl.substring(0,i+nbDecimales+1);

                }
            }
        }
        return doubl;
    }

    private static String tronquerAvecApi (double doubl, int nbDecimales) {

        DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(nbDecimales);

        return f.format(doubl);
    }
}
