import java.util.Scanner;
public class Produto {
    String nome, tamanho, cor;
    double valor;
    int quantidade, codigo;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularTroco(double valorPago) {
        return valorPago - this.valor;
    }

    public boolean verificarPagamento(double valorPago) {
        return valorPago >= this.valor;
    }

    public void cadastrarProduto(Scanner sc) {
        System.out.print("Informe o nome do produto: ");
        this.setNome(sc.next());
        System.out.print("Informe a quantidade no estoque: ");
        this.setQuantidade(sc.nextInt());
        System.out.println("Informe o tamanho do produto: ");
        this.setTamanho(sc.next());
        System.out.println("Informe a cor do produto: ");
        this.setCor(sc.next());
        System.out.println("Informe o código do produto: ");
        this.setCodigo(sc.nextInt());
        System.out.println("Informe o valor do produto: ");
        this.setValor(sc.nextDouble());
        System.out.println("----------------------");
    }

    public void processarCompra(Scanner sc) {
        System.out.println("Produto escolhido: " + this.getNome() + ".");
        System.out.println("Características do produto: \n Cor: " + this.getCor() + "\n Tamanho: " + this.getTamanho() + "\n Valor: R$" + this.getValor() + "\n Quantidade disponível em estoque: " + this.getQuantidade());
        System.out.println("Formas de pagamento disponíveis: ");
        System.out.println(" [1] - PIX \n [2] - Espécie \n [3] - Transferência \n [4] - Débito \n [5] - Crédito(disponível parcelamento em até 3x sem juros). \n Para o pagamento em PIX, espécie, transferência ou Débitos, há 5% de desconto.");
        System.out.println("Qual forma de pagamento deseja?");
        int pagamento = sc.nextInt();

        double valorPago = 0;
        switch (pagamento) {
            case 1:
                System.out.println("Opção escolhida: PIX \n Código copia e cola: a1b2c3d4-e5f6-7g8h-9i0j-k1l2m3n4o5p6");
                this.quantidade--;
                break;

            case 2:
                System.out.println("Opção escolhida: Espécie. Informe o valor da nota");
                valorPago = sc.nextDouble();
                if (this.verificarPagamento(valorPago)) {
                    double troco = this.calcularTroco(valorPago);
                    System.out.println("Troco: R$ " + troco);
                    this.quantidade--;
                } else {
                    System.out.println("Valor insuficiente! Você deve R$ " + (this.getValor() - valorPago) + " a mais.");
                }
                break;

            case 3:
                System.out.println("Opção escolhida: Transferência. Informe o valor transferido");
                valorPago = sc.nextDouble();
                if (this.verificarPagamento(valorPago)) {
                    double troco = this.calcularTroco(valorPago);
                    System.out.println("Troco: R$ " + troco);
                    this.quantidade--;
                } else {
                    System.out.println("Valor insuficiente! Você deve R$ " + (this.getValor() - valorPago) + " a mais.");
                }
                break;

            case 4:
                System.out.println("Opção escolhida: Débito. Informe o valor debitado");
                valorPago = sc.nextDouble();
                if (this.verificarPagamento(valorPago)) {
                    double troco = this.calcularTroco(valorPago);
                    System.out.println("Troco: R$ " + troco);
                    this.quantidade--;
                } else {
                    System.out.println("Valor insuficiente! Você deve R$ " + (this.getValor() - valorPago) + " a mais.");
                }
                break;

            case 5:
                System.out.println("Opção escolhida: Crédito. Informe o valor da compra");
                valorPago = sc.nextDouble();
                if (this.verificarPagamento(valorPago)) {
                    double troco = this.calcularTroco(valorPago);
                    System.out.println("Troco: R$ " + troco);
                    this.quantidade--;
                } else {
                    System.out.println("Valor insuficiente! Você deve R$ " + (this.getValor() - valorPago) + " a mais.");
                }
                break;
        }
        System.out.println("Compra confirmada!");
    }
}