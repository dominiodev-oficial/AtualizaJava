package java_8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Desafio {
    
    /*
    O desafio dessa primeira aula é mudar esse código para usar lambdas
    na filtragem e na impressão dos produtos para deixar o código mais limpo
     */

    public static void main(String[] args) {
        List<Produto> produtos = Produto.carregarLista();

        // Filtra produtos acima de 100 reais
        List<Produto> produtosFiltrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getPreco() > 100.0) {
                produtosFiltrados.add(produto);
            }
        }

        // Imprime produtos filtrados
        for (Produto p : produtosFiltrados) {
            System.out.println(p.getNome()+ " - R$ " + p.getPreco());
        }
    }

}
