public class Animal {
    protected String nome, raca;

    public Animal(){
    }

    public Animal(String nome){
        this.nome = nome;
    }
    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }
}
