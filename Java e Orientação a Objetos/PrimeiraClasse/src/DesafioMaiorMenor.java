import java.util.Scanner;

public class DesafioMaiorMenor {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("======= VAMOS COMPARAR? ======");
        System.out.println("Digite seu primeiro numero: ");
        int numero1 = leitura.nextInt();
        System.out.println("Digite seu segundo numero: ");
        int numero2 = leitura.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro numero digitado é maior que o " +
                    "segundo");
        } else if (numero1 < numero2) {
            System.out.println("O primeiro numero digitado é menor que o " +
                    "segundo");
        } else {
            System.out.println("Os números são iguais!");
        }

    }
}
