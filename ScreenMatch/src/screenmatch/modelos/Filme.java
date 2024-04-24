package screenmatch.modelos;

public class Filme {
        private String nome;
        private int anoLancamento;
        private boolean incluidoPlano;
        private double somaAvaliacao;
        private int totalAvaliacoes;
        private int duracaoFilme;

        //Métodos

        //Usamos o GET quando queremos pegar um valor, assim como usamos set quando queremos atribuir um valor.
        public int getTotalAvaliacoes(){
                return totalAvaliacoes;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public void setAnoLancamento(int anoLancamento) {
                this.anoLancamento = anoLancamento;
        }

        public void setDuracaoFilme(int duracaoFilme) {
                this.duracaoFilme = duracaoFilme;
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