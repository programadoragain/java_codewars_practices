package letras_cambia_primera;

import java.util.List;

public class PigLatin {
    
    public static String pigIt (String str) {
        String[] split= str.split(" ");
        char primerLetra= ' ';
        String palabra= "";
        String frase= "";


        for (String s :split) {
     
            palabra= "";
            for (int i=0; i < s.length(); i++) {
                if (i==0) primerLetra= s.charAt(i);
                if (i < s.length()-1) {
                    palabra+= s.charAt(i+1);
                }     
            }
            
            if (!s.equals("!") && !s.equals(".") && !s.equals("?")) {
                palabra+= primerLetra + "ay ";
            }
            else {
                palabra+= primerLetra;
            }

            frase+= palabra;
        }

        return frase.trim();
    }
}

/** (Mejor Solución)
 * public class PigLatin {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
OR
public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
}

 */

class main {
    public static void main (String[] args) {
        PigLatin ob= new PigLatin();
        String s= "Hola buen dia !";
        
        System.out.println(ob.pigIt(s));

    } 
}