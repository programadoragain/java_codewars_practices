package nada;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Main {

    public static void main (String[] args) {

        List<String> ciudades= new ArrayList<>();

        ciudades.add("General Roca");
        ciudades.add("Neuquen");
        ciudades.add("Ciudad de Bs As");
        ciudades.add("Rosario");

        // ciudades.stream().parallel().forEach(x -> System.out.println(x));
        // ciudades.stream().parallel().forEach(System.out::println);
        ciudades.stream().filter(x -> x.equals("Neuquen")).filter(x -> x.length() < 8).forEach(System.out::println);

    }
 
    
}
