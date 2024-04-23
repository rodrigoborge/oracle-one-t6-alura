public class Carro {
    String modeloCarro;
    String montadora;
    int anoFabricacao;
    int modeloAno;
    double versaoMotor;

    boolean exibeFichaCarro(){
        System.out.println("Modelo: " + modeloCarro);
        System.out.println("Montadora: " + montadora);
        System.out.println("Ano/Modelo: " + anoFabricacao + " / " + modeloAno);
        System.out.println("Versão: " + versaoMotor);
        return false;
    }

    double idadeCarro(){return 2024 - anoFabricacao;}
}
