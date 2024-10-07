import java.util.Scanner;

public class Gerente extends Funcionario {
    protected String projeto;
    Scanner input = new Scanner(System.in);

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void informarProjeto() {
        this.projeto = projeto;
        System.out.println("Informe o nome do projeto: ");
        projeto = input.nextLine();
    }
}


