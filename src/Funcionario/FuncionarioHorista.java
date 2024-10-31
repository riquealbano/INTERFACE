// Pacote apenas para separar bem os códigos
package Funcionario;

	//Classe FuncionarioHorista que implementa a interface Funcionario
public class FuncionarioHorista implements Funcionario {
	private double totalRecebidoAnual;

 	// Construtor para inicializar o total anual recebido pelo funcionário horista
 	public FuncionarioHorista(double totalRecebidoAnual) {
     	this.totalRecebidoAnual = totalRecebidoAnual;
 	}

 	// Implementação do método calcularBonus para funcionários horistas
 	@Override
 	public double calcularBonus() {
     	return totalRecebidoAnual * 1.10;  // Bônus de 10% sobre o total anual recebido
 	}

 	// Retornar o valor de totalRecebidoAnual
 	public double getTotalRecebidoAnual() {
 		return totalRecebidoAnual;
 	}
}