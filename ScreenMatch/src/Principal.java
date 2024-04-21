public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoFilme = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(10);
        System.out.println("Total de avaliações: " + meuFilme.totalAvaliacoes);
        System.out.printf("Avaliação: %.1f", meuFilme.mediaAvaliacoes());
    }
}
