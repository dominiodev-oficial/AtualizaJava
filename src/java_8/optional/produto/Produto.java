package java_8.optional.produto;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Produto {
    private Long id;
    private String nome;
    private UnidadeMedida unidadeMedida;

    public Produto(Long id, String nome, UnidadeMedida unidadeMedida) {
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
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

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public static List<Produto> carregaListaProdutos() {
        return Arrays.asList(
                new Produto(1L, "Arroz", new UnidadeMedida("Quilograma", "kg")),
                new Produto(2L, "Leite", new UnidadeMedida("Litro", "L")),
                new Produto(3L, "Ovos", null)
        );
    }

    public static Produto carregaProduto(Long idProduto) {
        return Produto.carregaListaProdutos().stream().filter(p -> Objects.equals(p.id, idProduto)).findFirst().orElse(null);
    }
}
