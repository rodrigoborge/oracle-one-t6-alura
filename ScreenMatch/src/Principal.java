import screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoFilme(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.printf("Avaliação: %.1f", meuFilme.mediaAvaliacoes());
    }
}
