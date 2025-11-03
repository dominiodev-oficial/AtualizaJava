package java_8.stream.vendas;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VendaService {

    // 1. Filtrar vendas por vendedor
    public void imprimirVendasPorVendedor(List<Venda> vendas, String vendedor) {
        vendas.stream()
              .filter(v -> v.getVendedor().equalsIgnoreCase(vendedor))
              .forEach(v -> System.out.println(v));
    }

    // 2. Filtrar vendas concluídas (situacao = 'CONCLUIDA')
    public void imprimirVendasConcluidas(List<Venda> vendas) {
        vendas.stream()
              .filter(v -> v.getSituacao().equalsIgnoreCase("CONCLUIDA"))
              .forEach(v -> System.out.println(v));
    }

    // 3. Calcular média do valor de vendas
    public double calcularMediaValorVendas(List<Venda> vendas) {
        return vendas.stream()
                .mapToDouble(v -> v.getValor())
                .average()
                .orElse(0.0);
    }

    // 4. Encontrar a venda com maior valor
    public void imprimirVendaComMaiorValor(List<Venda> vendas) {
        vendas.stream()
                .max(Comparator.comparingDouble(v -> v.getValor()))
                .ifPresent(v -> System.out.println(v));
    }

    // 5. Encontrar a venda com menor valor
    public void imprimirVendaComMenorValor(List<Venda> vendas) {
        vendas.stream()
                .min(Comparator.comparingDouble(v -> v.getValor()))
                .ifPresent(v -> System.out.println(v));
    }

    // 6. Agrupar vendas por cliente
    public void agruparPorCliente(List<Venda> vendas) {
        Map<String, List<Venda>> agrupado = vendas.stream()
                .collect(Collectors.groupingBy(v -> v.getCliente()));
        agrupado.forEach((cliente, lista) -> {
            System.out.println("Cliente: " + cliente);
            lista.forEach(v -> System.out.println(v));
        });
    }

    // 7. Ordenar vendas por valor (decrescente)
    public void ordenaPorValor(List<Venda> vendas) {
        vendas.stream()
                .sorted(Comparator.comparingDouble(Venda::getValor).reversed())
                .forEach(System.out::println);
    }

    // 8. Somar todas os valores (redução)
    public double somarValores(List<Venda> vendas) {
        return vendas.stream()
                .mapToDouble(v -> v.getValor())
                .sum();
    }

    // 9. Criar lista apenas com o nome dos clientes
    public List<String> listarClientes(List<Venda> vendas) {
        return vendas.stream()
                .map(Venda::getCliente)
                .distinct()
                .collect(Collectors.toList());
    }

    // 10. Verificar se há alguma venda aberta
    public boolean existeVendasEmAberto(List<Venda> vendas) {
        return vendas.stream()
                .anyMatch(v -> v.getSituacao().equalsIgnoreCase("ABERTA"));
    }

    // 11. Verificar se todas as vendas estão concluídas
    public boolean todasAsVendasConcluidas(List<Venda> vendas) {
        return vendas.stream()
                .allMatch(v -> v.getSituacao().equalsIgnoreCase("CONCLUIDA"));
    }

    // 12. Gerar estatísticas dos valores de vendas
    public void estatisticasValoresDeVenda(List<Venda> vendas) {
        DoubleSummaryStatistics stats = vendas.stream()
                .mapToDouble(Venda::getValor)
                .summaryStatistics();

        System.out.println("Total: " + stats.getSum());
        System.out.println("Média: " + stats.getAverage());
        System.out.println("Maior valor: " + stats.getMax());
        System.out.println("Menor valor: " + stats.getMin());
    }

    // 13. - Total de vendas por vendedor
    public double totalVendasPorVendedor(List<Venda> vendas, String vendedor) {
        return vendas.stream()
                .filter(v -> v.getVendedor().equalsIgnoreCase(vendedor))
                .mapToDouble(Venda::getValor)
                .sum();
    }

    // 14. - Imprimir total de vendas agrupado por vendedores
    public void imprimirTotalVendasAgrupadoVendedores(List<Venda> vendas) {
        Map<String, Double> totalPorVendedor = vendas.stream()
                .collect(Collectors.groupingBy(
                        Venda::getVendedor,
                        Collectors.summingDouble(Venda::getValor)
                ));
        totalPorVendedor.forEach((vendedor, total) -> {
            System.out.println(vendedor + ": " + total);
        });
    }

}
