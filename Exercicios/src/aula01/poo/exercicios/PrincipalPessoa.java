package aula01.poo.exercicios;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa dadosPessoa = new Pessoa();
        dadosPessoa.nomeCompleto = "Rodrigo Borge";
        dadosPessoa.sexo = "Masculino";
        dadosPessoa.idade = 34;

        dadosPessoa.exibePeessoa();
    }
}
