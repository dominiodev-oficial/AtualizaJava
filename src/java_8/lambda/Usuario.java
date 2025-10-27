package java_8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private Long id;
    private String nome;
    private String tipo;

    public Usuario(Long id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static List<Usuario> carregarLista() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1L, "Ana", "USER"));
        usuarios.add(new Usuario(2L, "Pedro", "ADM"));
        usuarios.add(new Usuario(3L, "Mariana", "USER"));
        usuarios.add(new Usuario(4L, "Lucas", "ADM"));
        usuarios.add(new Usuario(5L, "Sofia", "USER"));
        usuarios.add(new Usuario(6L, "Gabriel", "USER"));
        usuarios.add(new Usuario(7L, "Isabela", "ADM"));
        usuarios.add(new Usuario(8L, "Matheus", "USER"));
        usuarios.add(new Usuario(9L, "Laura", "ADM"));
        usuarios.add(new Usuario(10L, "Rafael", "USER"));
        return usuarios;
    }
}
