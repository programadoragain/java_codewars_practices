package imprimir_impar;
import imprimir_impar.odd.impares;

public class principal {
    public static void main (String[] args) {
        int[] numbers= {8,8,9,10,10,2,1,9,4,4,5};
        impares ob= new impares();

        System.out.println(ob.findIt(numbers));
    }
}
