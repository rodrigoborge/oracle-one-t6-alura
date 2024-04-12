import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner leituraDia = new Scanner(System.in);
        System.out.println("Digite um número de 1 à 7: ");
        int dia = leituraDia.nextInt();
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda";
                break;
            case 3:
                nomeDia = "Terça";
                break;
            case 4:
                nomeDia = "Quarta";
                break;
            case 5:
                nomeDia = "Quinta";
                break;
            case 6:
                nomeDia = "Sexta";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Valor inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
