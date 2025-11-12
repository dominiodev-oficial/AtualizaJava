package java_8.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplos {

    public static void main(String[] args) {
        List<String> nomesCompletos = Arrays.asList("Ana Maria","Patrícia Lima","Bruno Alves","Carlos Roberto","Amanda Leão");

        // Exemplo de método construtor
        List<Pessoa> pessoas = nomesCompletos.stream()
                .map(n -> new Pessoa(n))
                .collect(Collectors.toList());

        // Exemplo de método de instância de objeto arbitrário de tipo específico
        List<String> nomes = pessoas.stream()
                .map(p -> p.getNome())
                .collect(Collectors.toList());

        // Exemplo de método de instância de determinado objeto
        ClasseUtil util = new ClasseUtil();
        nomes.forEach(n -> util.imprimir(n));

        // Exemplo de método estático
        nomes.stream()
                .map(n -> ClasseUtil.inverterTexto(n))
                .forEach(n -> util.imprimir(n));
    }

}
