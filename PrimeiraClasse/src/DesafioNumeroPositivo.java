import java.util.Scanner;

public class DesafioNumeroPositivo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numeroUsuario = leitura.nextInt();

        if (numeroUsuario >= 0) {
            System.out.println("O número que você digitou é positivo.");
        } else {
            System.out.println("O número que você digitou é negativo.");
        }
    }
}
