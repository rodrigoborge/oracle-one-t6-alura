package aula02.poo.exercicios;

public class Aluno {
    private String nome;
    private double notas;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void calcularMedia(){
        media = notas / 4;
        System.out.println(media);
    }
}
