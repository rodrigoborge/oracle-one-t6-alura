package trabalhando.com.listas.e.colecao.de.dados.exercicio;

import java.util.ArrayList;

public class PrincipalPoduto {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("iPhone", 2999, 10);
        Produto produto2 = new Produto("Galaxy 23", 1999,25);
        Produto produto3 = new Produto("Carregador", 19.9,9);
        Produto produto4 = new Produto("Cabo USB-C", 9.9,50);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);

        System.out.println("O tamanho da lista é " + listaProdutos.size());
        System.out.println("O produto na posiçao 4 é o: " + listaProdutos.get(3).getNome());

    }
}
