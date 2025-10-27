package java_8.lambda;

import java.util.Comparator;
import java.util.List;

public class Ordenacao {

    public static void main(String[] args) {
        List<Usuario> usuarios = Usuario.carregarLista();
        System.out.println("Lista sem ordenação: ");
        usuarios.forEach((u) -> System.out.println(u.getNome()));

        ordenarComLambda(usuarios);
        System.out.println("Lista ordenada: ");
        usuarios.forEach((u) -> System.out.println(u.getNome()));
    }

    private static void ordenarSemLambda(List<Usuario> usuarios) {
        usuarios.sort(new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return u1.getNome().compareTo(u2.getNome());
            }
        });
    }

    private static void ordenarComLambda(List<Usuario> usuarios) {
        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
    }

}
