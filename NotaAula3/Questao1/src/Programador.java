import java.util.Scanner;

public class Programador extends Funcionario{
    protected String linguagem;
    Scanner input = new Scanner(System.in);

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void informarLinguagem(){
        this.linguagem = linguagem;
        System.out.println("Informe o nome da linguagem que será utilizada: ");
        linguagem = input.next();
    }
}

