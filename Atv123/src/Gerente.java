public class Gerente extends Funcionario {
    String departamento;

    public Gerente(String nome, String id, int idade, String departamento) {
        super(nome, id, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void apresentacao(){
        System.out.println("Sou o " + getNome() + " e trabalho como gerente no departamento de " + getDepartamento());
    }
}
