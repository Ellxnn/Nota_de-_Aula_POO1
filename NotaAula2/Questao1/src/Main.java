import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Conta c = new Conta();

        System.out.println("Informe seu nome completo: ");
        c.setTitular(s.nextLine());

        System.out.println("Para conta corrente, digite 1. Para conta poupança, digite 2: ");
        int escolha = sc.nextInt();

        String continuar;

        switch (escolha) {
            case 1:
                do{
                System.out.println(" Menu: \n (1)Depositar \n (2)Sacar \n (3)Usar cheque especial \n (4)Exibir dados da conta \n (5)Sair");
                int contac = sc.nextInt();
                switch (contac) {
                    case 1:
                        System.out.println("Qual o valor que deseja depositar? ");
                        c.setValor(sc.nextDouble());
                        c.Deposito();
                        break;
                    case 2:
                        System.out.println("Qual o valor que deseja sacar? ");
                        c.setValor(sc.nextDouble());
                        c.Saque();
                        System.out.println("Seu saldo atual é: R$" + c.getSaldo());
                        break;
                    case 3:
                        System.out.println("O cheque especial disponível é de R$1000,00. Quanto deseja utilizar?");
                        c.setValor(sc.nextDouble());
                        System.out.println("Cheque especial utilizado. Seu saldo atual é R$" + c.Cheque_Esp());
                        break;
                    case 4:
                        System.out.println("Dados da conta: \n Titular: " + c.getTitular() + "\n Tipo de conta: Conta corrente \n Saldo atual: " + c.getSaldo());
                        break;
                    case 5:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
                System.out.println("Deseja voltar ao menu para realizar outra transação? (s/n)");
                continuar = sc.next();
                }while(continuar.equalsIgnoreCase("S"));

            case 2:
                do{
                    System.out.println(" Menu: \n (1)Depositar \n (2)Sacar \n (3)Calcular rendimento \n (4)Exibir dados da conta \n (5)Sair");
                    int contap = sc.nextInt();
                    switch (contap) {
                        case 1:
                            System.out.println("Qual o valor que deseja depositar? ");
                            c.setValor(sc.nextDouble());
                            c.Deposito();
                            break;
                        case 2:
                            System.out.println("Qual o valor que deseja sacar? ");
                            c.setValor(sc.nextDouble());
                            c.Saque();
                            System.out.println("Seu saldo atual é: R$" + c.getSaldo());
                            break;
                        case 3:
                            System.out.println("Por favor, informe a taxa Selic atual: ");
                            c.setSelic(sc.nextDouble());
                            c.calc_rendimento();
                            System.out.println("O rendimento atual é " + c.rendimento);
                            break;
                        case 4:
                            System.out.println("Dados da conta: \n Titular: " + c.getTitular() + "\n Tipo de conta: Conta corrente \n Saldo atual: " + c.getSaldo());
                            break;
                        case 5:
                            System.out.println("Encerrando...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                }
                System.out.println("Deseja voltar ao menu para realizar outra transação? (s/n)");
                continuar = sc.next();
                }while(continuar.equalsIgnoreCase("S"));


}
    }
}