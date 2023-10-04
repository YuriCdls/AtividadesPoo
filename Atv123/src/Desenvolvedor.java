public class Desenvolvedor extends Funcionario{
    String linguagem;

    public Desenvolvedor(String nome, String id, int idade, String linguagem) {
        super(nome, id, idade);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    @Override
    public void apresentacao(){
        System.out.println("Sou o desenvolvedor " + getNome() + " e domino a linguagem " + getLinguagem());
    }
}
