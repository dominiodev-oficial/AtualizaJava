package java_8.stream.vendas;

import java.util.*;
import java.util.stream.Collectors;

public class VendaService {

    // 1. Filtra vendas por vendedor
    public void filtraVendasPorVendedor(List<Venda> vendas, String vendedor) {
        vendas.stream()
                .filter(v -> v.getVendedor().equalsIgnoreCase(vendedor))
                .forEach(v -> System.out.println(v));
    }

    // 2. Lista nome de clientes sem repetição
    public void listaNomeClientes(List<Venda> vendas) {
        String clientes = vendas.stream()
                .map(v -> v.getCliente())
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println("Clientes: " + clientes);
    }

    // 3. Calcula estatisticas do valor de vendas
    public void calculaEstatisticasDeVendas(List<Venda> vendas) {
        double media = vendas.stream()
                .mapToDouble(Venda::getValor)
                .average()
                .orElse(0.0);

        double total = vendas.stream()
                .mapToDouble(Venda::getValor)
                .sum();

        System.out.println("Média das vendas: " + media);
        System.out.println("Total vendido: " + total);
    }

    // 4. Agrupa vendas por vendedor
    public void agrupaVendasPorVendedor(List<Venda> vendas) {
        Map<String, List<Venda>> vendasPorVendedor = vendas.stream()
                .collect(Collectors.groupingBy(v -> v.getVendedor()));
        vendasPorVendedor.forEach((vendedor, lista) -> {
            System.out.println("Vendedor: " + vendedor);
            lista.forEach(v -> System.out.println(v));
        });
    }

    // 5. Ordena vendas por valor (decrescente)
    public void ordenaVendasPorValor(List<Venda> vendas) {
        vendas.stream()
                .sorted(Comparator.comparingDouble((Venda v) -> v.getValor()).reversed())
                .forEach(v -> System.out.println(v));
    }

    // 6. Verifica vendas por situação
    public void verificaVendasPorSituacao(List<Venda> vendas) {
        boolean existeAberta = vendas.stream()
                .anyMatch(v -> "ABERTA".equalsIgnoreCase(v.getSituacao()));

        boolean todasConcluidas = vendas.stream()
                .allMatch(v -> "CONCLUIDA".equalsIgnoreCase(v.getSituacao()));

        System.out.println("Há vendas abertas? " + existeAberta);
        System.out.println("Todas as vendas estão concluídas? " + todasConcluidas);
    }

}
