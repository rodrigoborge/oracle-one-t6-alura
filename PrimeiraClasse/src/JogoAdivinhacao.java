import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroTentativas = 0;
        int chute;

        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

    while (numeroTentativas < 5 ) {
        System.out.println("Digite seu chute de 0 a 100: ");
        chute = leitura.nextInt();

        if (chute > numeroAleatorio) {
            System.out.println("O numero é menor que: " + chute);
        } else if (chute < numeroAleatorio)
            System.out.println("O número é maior que: " + chute);
        else {
            System.out.println("Parabéns!!! Você acertou!");
            break;
        }
        {
        }

        numeroTentativas++;

        if (numeroTentativas >= 5) {
            System.out.println("Suas chances acabaram, o número era: " + numeroAleatorio);
        }
    }
    }
}
