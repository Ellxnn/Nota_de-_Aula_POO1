import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    CalculoCorrida c1 = new CalculoCorrida();

        System.out.println("Bem-vindo a Uber! ");
        System.out.println("Informe a distância a distância percorrida (em Km): ");
        c1.setDistancia(s.nextDouble());
        System.out.println("Informe quanto tempo houve de espera (em minutos): ");
        c1.setTempoEspera(s.nextInt());
        System.out.println("Há alta demanda? Digite (1) para sim, (2) para não.");
        c1.setFatorDemanda(s.nextDouble());
        double valorFinal = c1.calcularValorCorrida();
        c1.exibirDetalhesCorrida();



    }
}