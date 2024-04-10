public class FormadoString {
    public static void main(String[] args){

//        Nesse exemplo, os valores das variáveis nome, idade e valor são passados
//        como parâmetros para o método String.format, substituindo os placeholders
//        %s, %d e %.2f, respectivamente

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f" +
                "reais%n", nome, idade, valor);

        //Usa-se o método que citei em aula, o formatted, para informar as
        // variáveis que deverão ser utilizadas no lugar dos placeholders.
        String nome2 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, aulas);
        System.out.println(mensagem);

    }
}
