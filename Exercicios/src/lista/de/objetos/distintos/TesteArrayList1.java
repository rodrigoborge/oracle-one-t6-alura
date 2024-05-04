package lista.de.objetos.distintos;

public class TesteArrayList1 {
    private String nome;

    public TesteArrayList1(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n" + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
