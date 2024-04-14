import java.util.Scanner;

public class Enquanto {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            double mediaAvaliacao = 0;
            double nota = 0;
            double mediaTotal;
            int totalNotas = 0;

            while (nota != -1) {
                System.out.println("Digite sua avaliaçao para o filme ou -1 " +
                        "para encerrar: ");
                nota = leitura.nextDouble();

                if (nota != -1){
                    mediaAvaliacao = mediaAvaliacao + nota;
                    totalNotas++;
                }
            }
            mediaTotal = mediaAvaliacao / totalNotas;
            System.out.printf("A média de avaliações é de: %.1f", mediaTotal);
        }
    }
