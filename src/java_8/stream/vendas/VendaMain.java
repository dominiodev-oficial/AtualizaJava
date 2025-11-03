package java_8.stream.vendas;

import java.util.List;

public class VendaMain {

    public static void main(String[] args) {
        VendaService service = new VendaService();
        List<Venda> vendas = Venda.carregarLista();

        service.imprimirTotalVendasAgrupadoVendedores(vendas);
    }

}
