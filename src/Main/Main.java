package Main;

// Importação das duas Classes e da Interface do pacote Funcionario
import Funcionario.FuncionarioAssalariado;
import Funcionario.FuncionarioHorista;
import Funcionario.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		// Criando instâncias de FuncionariosAssalariados com diferentes totais anuais recebidos
		Funcionario assalariado1 = new FuncionarioAssalariado(60000.00);
        System.out.println("Bônus do Funcionario Assalariado 1: R$ " + assalariado1.calcularBonus());

        Funcionario assalariado2 = new FuncionarioAssalariado(75000.00);
        System.out.println("Bônus do Funcionario Assalariado 2: R$ " + assalariado2.calcularBonus());

        // Criando instâncias de FuncionarioHorista com diferentes totais anuais recebidos
        Funcionario horista1 = new FuncionarioHorista(40000.00);
        System.out.println("Bônus do Funcionario Horista 1: R$ " + horista1.calcularBonus());

        Funcionario horista2 = new FuncionarioHorista(55000.00);
        System.out.println("Bônus do Funcionario Horista 2: R$ " + horista2.calcularBonus());

	}

}
