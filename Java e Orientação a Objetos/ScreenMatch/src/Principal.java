import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodios;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.calculos.CalculadoraDeTempo;

public class Principal {
    public static <FlitroRecomendacao> void main(String[] args) {
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

        System.out.println("\n\n------------------------------\n\n");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2004);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração em minutos para maratonar Lost: " + lost.getDuracaoFilme());

        System.out.println("\n\n------------------------------\n\n");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoFilme(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FlitroRecomendacao filtro = (FlitroRecomendacao) new FiltroRecomendacao();
        ((FiltroRecomendacao) filtro).filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(lost);
        episodios.setTotalVisualizacoes(300);
        ((FiltroRecomendacao) filtro).filtra(episodios);

    }
}
