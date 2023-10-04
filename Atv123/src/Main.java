import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
	    Funcionario gerente1 = new Gerente("Santos", "123", 21, "Front");
        Funcionario desenvolvedor1 = new Desenvolvedor("Yuri", "323", 23, "Java");
        funcionarios.add(gerente1);
        funcionarios.add(desenvolvedor1);
        apresenta(funcionarios);
    }
    public static void apresenta(ArrayList<Funcionario> funcionarios){
        for (Funcionario funcionario : funcionarios){
            funcionario.apresentacao();
        }
    }
}
