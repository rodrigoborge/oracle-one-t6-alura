package aula1.colecao.de.dados.lista.exercicios1;

import java.util.ArrayList;

public class PessoaPrincipal {
    public static void main(String[] args) {
        var novaPessoa = new Pessoa();
        novaPessoa.setNome("Rodrigo Borge");
        novaPessoa.setIdade(34);

        var novaPessoa2 = new Pessoa();
        novaPessoa2.setNome("Flavia Silva");
        novaPessoa2.setIdade(33);

        var novaPessoa3 = new Pessoa();
        novaPessoa3.setNome("Maria Borges");
        novaPessoa3.setIdade(64);

        ArrayList <Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(novaPessoa);
        listaPessoas.add(novaPessoa2);
        listaPessoas.add(novaPessoa3);
        System.out.println("O tamanho da lista de pessoas é de: " + listaPessoas.size());
        System.out.println("A primeira pessoa da lista é: " + listaPessoas.get(0).getNome());
        System.out.println("To String da pessoa é: " + listaPessoas.get(0).toString());
        System.out.println(listaPessoas);
    }
}
