public class DesaficoPrecoOriginal {
    public static void main (String[]args){
        double precoOriginal = 19.90;
        double percentualDesconto  = 0.05;
        double calculoDesconto = precoOriginal * percentualDesconto;
        double resultadoFinal = precoOriginal - calculoDesconto;
        System.out.printf("O valor final da sua compra é de %.2f", resultadoFinal);
    }
}
