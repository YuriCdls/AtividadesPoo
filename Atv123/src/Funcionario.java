public class Funcionario {
    String nome;
    String id;
    int idade;

    public Funcionario(String nome, String id, int idade) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentacao(){
        System.out.println("Meu nome é " + getNome() + " e trabalho nessa empresa.");
    }
}
