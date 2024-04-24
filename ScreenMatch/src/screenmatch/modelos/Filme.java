package screenmatch.modelos;

public class Filme {
        public String nome;
        public int anoLancamento;
        public boolean incluidoPlano;
        private double somaAvaliacao;
        private int totalAvaliacoes;
        public int duracaoFilme;

        //Métodos

        //Usamos o GET quando queremos pegar um valor, assim como usamos set quando queremos atribuir um valor.
        public int getTotalAvaliacoes(){
                return totalAvaliacoes;
        }

        public void exibeFichaTecnica(){
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de lançamento: " + anoLancamento);
                System.out.println("Incluído no plano: " + incluidoPlano);
                System.out.println("Duração do filme: " + duracaoFilme);
        }

        public void avaliaFilme(double nota){
                somaAvaliacao += nota;
                totalAvaliacoes++;
        }

        public double mediaAvaliacoes(){
                return somaAvaliacao / totalAvaliacoes;
        }
}