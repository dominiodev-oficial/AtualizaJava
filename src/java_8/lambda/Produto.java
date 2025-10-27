package java_8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private Long id;
    private String nome;
    private double preco;

    public Produto(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static List<Produto> carregarLista() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1L, "Fone de Ouvido Bluetooth",115.0));
        produtos.add(new Produto(2L, "Carregador Portátil", 85.0));
        produtos.add(new Produto(3L, "Caixa de Som Bluetooth Mini", 75.0));
        produtos.add(new Produto(4L, "Hub USB", 65.0));
        produtos.add(new Produto(5L, "Mouse sem Fio", 109.0));
        produtos.add(new Produto(6L, "Pen Drive", 59.0));
        produtos.add(new Produto(7L, "Lâmpada Inteligente", 69.0));
        produtos.add(new Produto(8L, "Adaptador USB-C para HDMI", 117.0));
        produtos.add(new Produto(9L, "Cabo de Carregamento", 55.0));
        produtos.add(new Produto(10L, "Controle Gamepad para Smartphone", 119.00));
        return produtos;
    }
}
