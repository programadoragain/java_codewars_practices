package capitalización_1er_letra;

public class JadenCase {

	public String toJadenCase(String phrase) {
        
		if ((phrase == null) || (phrase == "")) return null;
        
        String[] palabras= phrase.split(" ");
        String resultado= "";
        String x;
        int i= 0;

        for (String palabra: palabras) {
            x= palabra.substring(0,1).toUpperCase() + palabra.substring(1);
            resultado+= x + " ";
        }

        i= resultado.length();
        resultado= resultado.substring(0, (i-1));

		return resultado;
    }

}