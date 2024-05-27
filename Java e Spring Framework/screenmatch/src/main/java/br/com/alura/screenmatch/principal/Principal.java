package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.services.ConsumoApi;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=4a00064d";

    public void exibeMenu(){
        System.out.println("Digite o  nome da série: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ",
                "+") + API_KEY);

    }
}
