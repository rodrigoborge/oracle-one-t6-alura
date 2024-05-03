package trabalhando.com.listas.e.colecao.de.dados.exercicio;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "\nProduto: [nome= " + getNome() + ", preço= " + getPreco() + ", quantidade= " + getQuantidade() + ", validade= " + getDataValidade() +"]";
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
