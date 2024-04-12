public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoPlano = false;
        double notaFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoLancamento >= 2022){
            System.out.println("Lançamentos mais curtidos");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoPlano == true || tipoPlano.equals("Plus")){
            System.out.printf("Filme liberado pois você possui o plano %s",
                    tipoPlano);
        } else {
            System.out.printf("Filme não incluso no plano %s", tipoPlano);
        }
    }
}
