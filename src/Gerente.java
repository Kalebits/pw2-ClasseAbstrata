
public class Gerente extends Funcionario {
	private double gratificacao;

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	public void listarFuncionario() {
		
		this.getNome();
		this.getCpf();
		this.getSalarioBase();
		this.getSalarioFinal();
		this.getValorBonificacao();
		this.getGratificacao();
		
		}
	
	public void calcularSalarioFinal(double gratificacao) {
		this.setSalarioFinal(this.getSalarioBase() + this.gratificacao + this.getValorBonificacao());
	}
	
	public String apresentarSalario() {
		return "Nome: " + this.getNome() + "\nSalario Base: " + this.getSalarioBase() + "\n Valor Bonificação: " + this.getValorBonificacao() + "\nGratificação: " + this.gratificacao + "\nSalario Final: " + this.getSalarioFinal();
	}
	
}
