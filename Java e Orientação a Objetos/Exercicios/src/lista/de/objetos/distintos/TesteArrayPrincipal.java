package lista.de.objetos.distintos;


import java.util.ArrayList;

public class TesteArrayPrincipal {
    public static void main(String[] args) {
        ArrayList<TesteArrayList1> listaProdutos = new ArrayList<>();

        TesteArrayList1 produto1 = new TesteArrayList1("Produto1");
        TesteArrayList1 produto2 = new TesteArrayList1("Produto2");
        TesteArrayList1 produto3 = new TesteArrayList1("Produto3");
        TesteArrayList1 produto4 = new TesteArrayList1("Produto4");
        TesteArrayList1 produto5 = new TesteArrayList1("Produto5");
        TesteArrayList1 produto6 = new TesteArrayList1("Produto6");

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);
        listaProdutos.add(produto6);

        System.out.println(listaProdutos);
    }
}
