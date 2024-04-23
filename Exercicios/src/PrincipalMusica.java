public class PrincipalMusica {
    public static void main(String[] args) {
        Musica dadosMusica =  new Musica();
        dadosMusica.nomeArtista = "Falcão";
        dadosMusica.nomeAlbum = "Qualquer Um";
        dadosMusica.anoLancamento = 1995;
        dadosMusica.quantidadeFaixas = 10;

        dadosMusica.exibeFichaTecnica();
    }
}
