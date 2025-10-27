package java_8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploFilter {

    public static void main(String[] args) {
        List<Usuario> usuarios = Usuario.carregarLista();
        System.out.println("Lista sem filtro: ");
        usuarios.forEach(u -> System.out.println(u.getNome() + " - " + u.getTipo()));
        filtrarComLambda(usuarios);
    }

    private static void filtrarSemLambda(List<Usuario> usuarios) {
        List<Usuario> administradores = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if ("ADM".equals(usuario.getTipo())) {
                administradores.add(usuario);
            }
        }

        System.out.println("Lista filtrada: ");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome() + " - " + usuario.getTipo());
        }
    }

    private static void filtrarComLambda(List<Usuario> usuarios) {
        List<Usuario> administradores = usuarios.stream()
            .filter(u -> "ADM".equals(u.getTipo()))
            .collect(Collectors.toList());

        System.out.println("Lista filtrada: ");
        administradores.forEach(u -> System.out.println(u.getNome() + " - " + u.getTipo()));
    }

}
