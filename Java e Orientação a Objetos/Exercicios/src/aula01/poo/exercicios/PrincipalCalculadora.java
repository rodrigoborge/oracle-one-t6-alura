package aula01.poo.exercicios;

public class PrincipalCalculadora {
    public static void main(String[] args) {
        Calculadora operacaoCalculadora = new Calculadora();
        operacaoCalculadora.numero1 = 25;

        System.out.println(operacaoCalculadora.dobroNumero1());
    }
}
