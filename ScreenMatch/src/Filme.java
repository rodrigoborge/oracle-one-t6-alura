public class Filme {
        String nome;
        int anoLancamento;
        boolean incluidoPlano;
        double somaAvaliacao;
        int totalAvaliacoes;
        int duracaoFilme;

        //Métodos
        void exibeFichaTecnica(){
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de lançamento: " + anoLancamento);
                System.out.println("Incluído no plano: " + incluidoPlano);
                System.out.println("Duração do filme: " + duracaoFilme);
        }

        void avaliaFilme(double nota){
                somaAvaliacao += nota;
                totalAvaliacoes++;
        }

        double mediaAvaliacoes(){
                return somaAvaliacao / totalAvaliacoes;
        }
}