package java_8.method_reference;

import java.util.UUID;

public class Pessoa {
    private UUID id;
    private String nome;
    private String sobrenome;

    public Pessoa(String nomeCompleto) {
        this.id = UUID.randomUUID();
        this.nome = nomeCompleto.split(" ")[0];
        this.sobrenome = nomeCompleto.split(" ")[1];
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Identificador: " + id + ", " +
               "Nome: " + nome + ", " +
               "Sobrenome: " + sobrenome;
    }
}
