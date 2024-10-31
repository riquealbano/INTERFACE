// Pacote apenas para separar bem os códigos
package Funcionario;

// Classe FuncionarioAssalariado que implementa a interface Funcionario
public class FuncionarioAssalariado implements Funcionario {
    private double salarioAnual;

    // Construtor para inicializar o salário anual
    public FuncionarioAssalariado(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    // Implementação do método calcularBonus para funcionários assalariados
    @Override
    public double calcularBonus() {
        return 5000.00 + salarioAnual;  // Bônus fixo de R$ 5.000,00
    }
    
    // Retornar o valor de salarioAnual
    public double getSalarioAnual() {
        return salarioAnual;
    }
}
