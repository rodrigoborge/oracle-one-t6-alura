import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numeroInteiro = leitura.nextInt();

        if (numeroInteiro % 2 == 0){
            System.out.println("O  numero é par!");
        } else {
            System.out.println("O numero é impar!");
        }

    }
}
