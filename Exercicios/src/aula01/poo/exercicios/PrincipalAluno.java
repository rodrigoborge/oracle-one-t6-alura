package aula01.poo.exercicios;

public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno fichaAluno = new Aluno();
        fichaAluno.nome = "Rodrigo Borge";
        fichaAluno.idade = 34;

        fichaAluno.exibeAluno();
    }
}
