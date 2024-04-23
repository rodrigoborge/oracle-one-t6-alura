public class Pessoa {
    String nomeCompleto;
    String sexo;
    int idade;

    boolean exibePeessoa(){
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        return false;
    }
}
