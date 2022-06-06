
public class Vendedor extends Funcionario {
	
	private double valorComissao;
	
	
	
	public double getValorComissao() {
		return valorComissao;
	}



	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}



	public void listarFuncionario() {
		this.getNome();
		this.getCpf();
		this.getSalarioBase();
		this.getSalarioFinal();
		this.getValorBonificacao();
		this.getValorComissao();
	}
	
	public void calcularSalarioFinal(double valorComissao) {
		this.setSalarioFinal(this.getSalarioBase() + this.valorComissao + this.getValorBonificacao());
	}
	
	public String apresentarSalario() {
		return "Nome: " + this.getNome() + "\nSalario Base: " + this.getSalarioBase() + "\n Valor Bonificação: " + this.getValorBonificacao() + "\nSalario Final: " + this.getSalarioFinal();
	}
	
}
