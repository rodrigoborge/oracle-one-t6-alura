public class Filme {
        String nome;
        int anoLancamento;
        boolean incluidoPlano;
        private double somaAvaliacao;
        private int totalAvaliacoes;
        int duracaoFilme;

        //Métodos

        //Usamos o GET quando queremos pegar um valor, assim como usamos set quando queremos atribuir um valor.
        int getTotalAvaliacoes(){
                return totalAvaliacoes;
        }

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