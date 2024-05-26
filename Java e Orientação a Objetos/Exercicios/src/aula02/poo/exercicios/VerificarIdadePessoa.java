package aula02.poo.exercicios;

public class VerificarIdadePessoa {
    public static void main(String[] args) {
        IdadePessoa verificaIdade = new IdadePessoa();
        verificaIdade.setNome("Rodrigo Borge");
        verificaIdade.setIdade(34);

        verificaIdade.verificarIdade();
    }

}
