package screenmatch.calculos;
//import screenmatch.modelos.modelos.Filme;
//import screenmatch.modelos.modelos.Serie;
import screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoFilme();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoFilme();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de: " + titulo);
        this.tempoTotal  += titulo.getDuracaoFilme();
    }

}
