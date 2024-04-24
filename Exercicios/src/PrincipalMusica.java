public class PrincipalMusica {
    public static void main(String[] args) {
        Musica dadosMusica =  new Musica();
        dadosMusica.nomeArtista = "Falcão";
        dadosMusica.tituloMusica = "Nao sei dizer";
        dadosMusica.anoLancamento = 1997;

        dadosMusica.exibeFichaTecnica();
        dadosMusica.avaliaMusica(8);
        dadosMusica.avaliaMusica(10);
        dadosMusica.avaliaMusica(9);
        dadosMusica.avaliaMusica(9);
        dadosMusica.avaliaMusica(10);
        System.out.println("Total de Avaliações: " + dadosMusica.numAvaliacao);
        System.out.println("Avaliações: " + dadosMusica.mediaAvaliacao());
    }
}
