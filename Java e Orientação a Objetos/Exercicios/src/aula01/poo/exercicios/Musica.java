package aula01.poo.exercicios;

public class Musica {
    String tituloMusica;
    String nomeArtista;
    int anoLancamento;
    double numAvaliacao;
    double somaAvaliacao;


    //Metodo
    void avaliaMusica(double avaliacao){
        somaAvaliacao += avaliacao;
        numAvaliacao++;
    }

    double mediaAvaliacao(){return somaAvaliacao / numAvaliacao;}

    boolean exibeFichaTecnica(){
        System.out.println("Título da Música: " + tituloMusica);
        System.out.println("Nome do Álbum: " + nomeArtista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        return false;
    }
}
