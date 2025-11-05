package java_8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploStream {

    public static void main(String[] args) {
        exemploComStream();
    }

    public static void exemploSemStream() {
        List<String> nomes = Arrays.asList("Ana", "Patrícia", "Bruno", "Carlos", "Amanda");
        List<String> resultado = new ArrayList<>();

        for (String n : nomes) {
            if (n.length() > 3) {
                resultado.add(n.toUpperCase());
            }
        }

        Collections.sort(resultado);

        for (String n : resultado) {
            System.out.println(n);
        }
    }

    public static void exemploComStream() {
        List<String> nomes = Arrays.asList("Ana", "Patrícia", "Bruno", "Carlos", "Amanda");
        nomes.stream()
                .filter(n -> n.length() > 3)
                .map(n -> n.toUpperCase())
                .sorted()
                .forEach(n -> System.out.println(n));
    }

}
