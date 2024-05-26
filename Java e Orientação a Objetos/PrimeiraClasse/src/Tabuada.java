import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("===== TABUADA =====");
        System.out.println("Digite o numero que você deseja ver a tabuada: ");
        int numeroTabuada = leitura.nextInt();

        for (int i = 0; i <= 10; i++) {

            System.out.println(numeroTabuada * i);
        }
    }
}
