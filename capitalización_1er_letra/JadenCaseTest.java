package capitalización_1er_letra;

public class JadenCaseTest {
	
	public static void main (String[] args) {

	JadenCase jadenCase = new JadenCase();
	
	String phrase= "hola mi nombre es fernando y estudio jav                            ";
	System.out.println("Frase Original: " + phrase);
	System.out.println("Frase Modificada: " + jadenCase.toJadenCase(phrase));
	}

}
