package java_8.optional.pessoa;

import java.util.Optional;

public class ExemploPessoaOptional {

    public static void main(String[] args) {
        Pessoa pessoa = Pessoa.carregaPessoa(4L);
        String estado = Optional.ofNullable(pessoa)
                .map(Pessoa::getEndereco)
                .map(Endereco::getCidade)
                .map(Cidade::getUf)
                .orElse("Estado não informado");
        System.out.println("Estado: " + estado);
    }

}