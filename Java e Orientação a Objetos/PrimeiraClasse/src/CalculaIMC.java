public class CalculaIMC {
    public static void main (String[]args) {
        float peso = 136;
        float altura = 1.83F;
        float imc = peso / (int)Math.pow(altura, 2);

        System.out.printf ("Seu IMC é de: %.1f", imc );
    }
}
