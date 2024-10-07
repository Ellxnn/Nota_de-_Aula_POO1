import java.util.Scanner;
public class Funcionario {
    protected String nome;
    protected int nascimento, idade;
    protected double salario;

    Scanner input = new Scanner(System.in);


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNascimento(){
        return nascimento;
    }

    public void setNascimento(int nascimento){
        this.nascimento = nascimento;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void informarSalario(){
        System.out.println("O salário do funcionário é: R$ " + salario);

    }

    public void calcularIdade(){
        idade = 2024 - nascimento;
    }


}
