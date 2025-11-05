package java_8.stream.vendas;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Long id;
    private String situacao;
    private double valor;
    private String vendedor;
    private String cliente;

    public Venda(Long id, String situacao, double valor, String vendedor, String cliente) {
        this.id = id;
        this.situacao = situacao;
        this.valor = valor;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ", " +
               "Vendedor: " + vendedor + ", " +
               "Situação: " + situacao + ", " +
               "Valor: " + valor;
    }

    public static List<Venda> carregarLista() {
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda(1L, "CONCLUIDA", 1500.00, "Maria", "Gabriel"));
        vendas.add(new Venda(2L, "CONCLUIDA", 500.0, "José", "Júlia"));
        vendas.add(new Venda(3L, "CONCLUIDA", 700.0, "Ana", "Marcos"));
        vendas.add(new Venda(4L, "CONCLUIDA", 250.0, "Maria", "Beatriz"));
        vendas.add(new Venda(5L, "CONCLUIDA", 150.0, "José", "Lucas"));
        vendas.add(new Venda(6L, "CONCLUIDA", 350.0, "Ana", "Sofia"));
        vendas.add(new Venda(7L, "CONCLUIDA", 750.0, "Maria", "Pedro"));
        vendas.add(new Venda(8L, "CONCLUIDA", 850.0, "José", "Marcos"));
        vendas.add(new Venda(9L, "CONCLUIDA", 550.0, "Ana", "Júlia"));
        vendas.add(new Venda(10L, "CONCLUIDA", 25.0, "Maria", "Beatriz"));
        return vendas;
    }

}
