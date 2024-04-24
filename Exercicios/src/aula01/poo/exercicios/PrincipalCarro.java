package aula01.poo.exercicios;

public class PrincipalCarro {
    public static void main(String[] args) {
        Carro fichaCarro = new Carro();
        fichaCarro.modeloCarro = "Uno";
        fichaCarro.montadora = "Fiat";
        fichaCarro.anoFabricacao = 2006;
        fichaCarro.modeloAno = 2007;
        fichaCarro.versaoMotor = 1.0;

        fichaCarro.exibeFichaCarro();
        fichaCarro.idadeCarro();
        System.out.println("A idade do carro é " + fichaCarro.idadeCarro() + " anos.");
    }
}
