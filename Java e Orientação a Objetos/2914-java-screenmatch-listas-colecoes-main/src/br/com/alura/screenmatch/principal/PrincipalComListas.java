package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2007);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println("Busca sem  ordenação: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Busca com ordenação: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados" + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenação por ano: " + lista);

    }
}
