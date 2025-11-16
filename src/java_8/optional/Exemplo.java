package java_8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exemplo {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Patrícia", "Ana", "Carlos");
        Optional<String> nomeOpt = nomes.stream()
                .filter(n -> n.length() > 50)
                .findFirst();
    }

}
