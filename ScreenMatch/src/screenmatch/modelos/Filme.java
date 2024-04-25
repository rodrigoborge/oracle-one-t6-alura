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

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public int getAnoLancamento() {
                return anoLancamento;
        }

        public void setAnoLancamento(int anoLancamento) {
                this.anoLancamento = anoLancamento;
        }

        public boolean isIncluidoPlano() {
                return incluidoPlano;
        }

        public void setIncluidoPlano(boolean incluidoPlano) {
                this.incluidoPlano = incluidoPlano;
        }

        public double getSomaAvaliacao() {
                return somaAvaliacao;
        }

        public void setSomaAvaliacao(double somaAvaliacao) {
                this.somaAvaliacao = somaAvaliacao;
        }

        public int getTotalAvaliacoes() {
                return totalAvaliacoes;
        }

        public void setTotalAvaliacoes(int totalAvaliacoes) {
                this.totalAvaliacoes = totalAvaliacoes;
        }

        public int getDuracaoFilme() {
                return duracaoFilme;
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