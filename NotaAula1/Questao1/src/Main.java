import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Calculo c = new Calculo();


        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua primeira nota: ");
        c.n1 = s.nextDouble();
        System.out.println("Informe sua segunda nota: ");
        c.n2 = s.nextDouble();
        System.out.println("Aluno: " + nome);
        System.out.println("Situação: " + c.media());
        System.out.println("Média: " + c.media);









        
    }
}