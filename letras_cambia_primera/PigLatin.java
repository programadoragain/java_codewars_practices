package letras_cambia_primera;

import java.util.List;

public class PigLatin {
    public static String pigIt(String str) {
        String[] split= str.split(" ");
        String primerLetra;
        String palabra;

        for (String s :split) {
            palabra= s;
            for (int i=0; i < s.length(); i++) {
                if (i==0) primerLetra= s[i];
                s[i]= s[i+1];
            }
        }
    
    }
}