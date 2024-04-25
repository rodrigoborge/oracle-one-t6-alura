package aula02.poo.exercicios;

public class descontoProduto {
    public static void main(String[] args) {
        Produto calculaDesconto = new Produto();
        calculaDesconto.setNome("Produto 01");
        calculaDesconto.setPreco(200);

        calculaDesconto.aplicarDesconto();
    }
}
