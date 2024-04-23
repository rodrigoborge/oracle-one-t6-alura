public class Musica {
    String nomeArtista;
    String nomeAlbum;
    int anoLancamento;
    int quantidadeFaixas;

    //Metodo
    boolean exibeFichaTecnica(){
        System.out.println("Nome do Artista: " + nomeArtista);
        System.out.println("Nome do Álbum: " + nomeAlbum);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Quantidade de faixas: " + quantidadeFaixas);;
        return false;
    }
}
