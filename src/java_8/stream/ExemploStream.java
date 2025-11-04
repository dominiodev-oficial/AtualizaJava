package java_8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploStream {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Patrícia", "Bruno", "Carlos", "Amanda");

        List<String> resultado = nomes.stream()
                .filter(n -> n.length() > 3)
                .map(n -> n.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        resultado.forEach(n -> System.out.println(n));
    }

}
