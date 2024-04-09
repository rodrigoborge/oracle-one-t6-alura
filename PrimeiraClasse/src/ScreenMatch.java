public class ScreenMatch {
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento);

        boolean incluidoPlano = false;
        System.out.println("Incluído no plano? " + incluidoPlano);

        double notaFilme = 8.1F;
        System.out.println("Nota: " + notaFilme);

        //Media calculada pelas três notas da Jaque, do paulo e Suellen
        double media = (9.8 + 6.3 + 8.9) / 3;
        System.out.println("Media: " + media);

        /*As aspas triplas fazem o texto ficar formatado de acordo com os
        espaçamentos dados no código*/
        String sinopse = """
                    Filme: Top Gun
                    Sinopse: Filme de aventura com galá dos anos 80.
                    Muito bom!
                    Ano de lançamento:
                  """ + anoLancamento;
        System.out.println(sinopse);



    }
}
