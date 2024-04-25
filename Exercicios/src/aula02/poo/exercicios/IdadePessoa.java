package aula02.poo.exercicios;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void verificarIdade(){
        if (idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
