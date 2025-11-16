package java_8.optional.pessoa;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Pessoa {
    private Long id;
    private String nome;
    private Endereco endereco;

    public Pessoa(Long id, String nome, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static List<Pessoa> carregaListaPessoas() {
        return Arrays.asList(
                new Pessoa(1L, "João Silva",
                        new Endereco("12345-678",
                                new Cidade("São Paulo", "SP"),
                                "100"
                        )
                ),
                new Pessoa(2L, "Maria Oliveira",
                        new Endereco("34567-890",
                                new Cidade("Belo Horizonte", "MG"),
                                "300"
                        )
                ),
                new Pessoa(3L, "Carlos Pereira", null)
        );
    }

    public static Pessoa carregaPessoa(Long idPessoa) {
        return Pessoa.carregaListaPessoas().stream()
                .filter(p -> Objects.equals(p.id, idPessoa))
                .findFirst()
                .orElse(null);
    }
}