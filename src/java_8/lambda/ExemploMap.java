package java_8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploMap {

    public static void main(String[] args) {
        List<Usuario> usuarios = Usuario.carregarLista();
        mapearNomeComLambda(usuarios);
    }

    private static void mapearNomeSemLambda(List<Usuario> usuarios) {
        List<String> nomes = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            nomes.add(usuario.getNome().toUpperCase());
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    private static void mapearNomeComLambda(List<Usuario> usuarios) {
        List<String> nomes = usuarios.stream()
                .map(u -> u.getNome().toUpperCase())
                .collect(Collectors.toList());
        nomes.forEach(System.out::println);
    }

}
