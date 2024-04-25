package aula02.poo.exercicios;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(){
        double desconto = this.preco * 0.10;
        this.preco = preco - desconto;
        System.out.println("O preço com desconto é de: " + this.preco);
    }
}
