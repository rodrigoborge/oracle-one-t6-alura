package aula02.poo.exercicios;

public class DetalhesLivro {
    public static void main(String[] args) {
        Livro exibirLivro = new Livro();
        exibirLivro.setTitulo("Java para Iniciantes: Crie, Compile e Execute Programas Java Rapidamente");
        exibirLivro.setAutor("Herbert Schildt");

        exibirLivro.exibirDetalhes();
    }
}
