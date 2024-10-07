import javax.xml.transform.Source;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    Gerente gerente = new Gerente();
    Programador programador = new Programador();


    System.out.println("Para o acesso de GERENTE, digite [1]. Para o acesso de PROGRAMADOR, digite [2]");
    int escolha = sc.nextInt();

    switch (escolha){
        case 1:
            System.out.println("-------------------------");
            System.out.println("Informe seu nome: ");
            gerente.setNome(s.nextLine());
            System.out.println("Informe o ano de seu nascimento: ");
            gerente.setNascimento(sc.nextInt());
            System.out.println("Informe o seu salário: ");
            gerente.setSalario(sc.nextDouble());
            gerente.informarProjeto();
            gerente.calcularIdade();
            System.out.println("Informações gerais: \nNome: " + gerente.getNome() + "\nIdade: " + gerente.idade + "\nCargo: Gerente" + "\nProjeto: " + gerente.projeto);
            gerente.informarSalario();
            break;

        case 2:
            System.out.println("-------------------------");
            System.out.println("Informe seu nome: ");
            programador.setNome(s.nextLine());
            System.out.println("Informe o ano de seu nascimento: ");
            programador.setNascimento(sc.nextInt());
            System.out.println("Informe o seu salário: ");
            programador.setSalario(sc.nextDouble());
            programador.informarLinguagem();
            programador.calcularIdade();
            System.out.println("Informações gerais: \nNome: " + programador.getNome() + "\nIdade: " + programador.idade + "\nCargo: Programador" + "\nProjeto: " + programador.linguagem);
            programador.informarSalario();
            break;

        default:
            System.out.println("Opção inválida.");
            }


    }
}