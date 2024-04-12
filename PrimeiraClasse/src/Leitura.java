import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoLancamento = leitura.nextInt();
        System.out.println("Seu filme favorito é: " + filmeFavorito);
        System.out.println("O ano de lançamento do filme é: " + anoLancamento);

    }
}
