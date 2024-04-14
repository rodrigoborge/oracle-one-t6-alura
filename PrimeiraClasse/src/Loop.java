import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        double mediaTotal = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("De 0 a 10, como você avalia este filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao = mediaAvaliacao + nota;
        }
        mediaTotal = mediaAvaliacao / 3;
        System.out.printf("A média de avaliações é de: %.1f", mediaTotal);
    }
}