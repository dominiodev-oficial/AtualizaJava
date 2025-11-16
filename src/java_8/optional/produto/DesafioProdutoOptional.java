package java_8.optional.produto;

public class DesafioProdutoOptional {

    public static void main(String[] args) {
        Produto produto = Produto.carregaProduto(1L);

        String siglaUnidadeMedida = "N/A";
        if (produto != null) {
            if (produto.getUnidadeMedida() != null) {
                if (produto.getUnidadeMedida().getSigla() != null) {
                    siglaUnidadeMedida = produto.getUnidadeMedida().getSigla();
                }
            }
        }

        System.out.println("Sigla da Unidade de Medida: " + siglaUnidadeMedida);
    }

}