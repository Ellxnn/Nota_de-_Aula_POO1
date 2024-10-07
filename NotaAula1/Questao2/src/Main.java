import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        int escolha;

        do {
            System.out.println("Para o cadastro de um produto, digite 1. Para a compra de produtos, digite 2. Para sair, digite 3.");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    p1.cadastrarProduto(sc);
                    p2.cadastrarProduto(sc);
                    p3.cadastrarProduto(sc);
                    break;

                case 2:
                    System.out.println("Os produtos disponíveis no momento são: ");
                    System.out.println("(1) - " + p1.getNome() + ". (Disponíveis: " + p1.getQuantidade() + ")");
                    System.out.println("(2) - " + p2.getNome() + ". (Disponíveis: " + p2.getQuantidade() + ")");
                    System.out.println("(3) - " + p3.getNome() + ". (Disponíveis: " + p3.getQuantidade() + ")");
                    System.out.println("Para adquirir algum dos produtos acima, digite o seu respectivo código. Para voltar, digite (4). ");
                    int escolha2 = sc.nextInt();
                    switch (escolha2) {
                        case 1:
                            p1.processarCompra(sc);
                            break;
                        case 2:
                            p2.processarCompra(sc);
                            break;
                        case 3:
                            p3.processarCompra(sc);
                            break;
                        case 4:
                            break;
                    }
                    break;
            }
        } while (escolha != 3);
    }
}
