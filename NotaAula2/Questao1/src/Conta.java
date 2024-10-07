public class Conta {
    protected String titular;
    protected double saldo = 0;
    protected double rendimento;

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    protected double selic;


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private double valor;

    public double Deposito() {
        saldo += valor;
        return saldo;
    }

    public double Saque() {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
            return saldo;
        } else {
            saldo = saldo - valor;
            return saldo;
        }
    }
    public double Cheque_Esp() {
        saldo = saldo - valor;
        return saldo;

            }
    public double calc_rendimento(){
            if(selic>8.5){
                rendimento = 0.005 * saldo;
                return rendimento;
            }
            else{
                rendimento = 0.007 * selic * saldo;
                return rendimento;
            }
    }
        }


