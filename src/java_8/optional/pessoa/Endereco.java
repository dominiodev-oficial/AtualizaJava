package java_8.optional.pessoa;

public class Endereco {
    private String cep;
    private Cidade cidade;
    private String numero;

    public Endereco(String cep, Cidade cidade, String numero) {
        this.cep = cep;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
