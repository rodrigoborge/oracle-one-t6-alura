package requisicoes.e.respostas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a criptomoeda: ");
        var busca = leitura.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=brl&ids=" + busca +
                "&x_cg_demo_api_key=CG-fvAf5nAg4yALxYQTEcGLnmxH";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
