package conta;

public class Conta {

	// atributo privados para utlizar com os métodos get e set
	private String titular;
	private double quantidade;

	// construtor que obriga o preenchimento do nome do titular
	public Conta(String titular) {
		super();
		this.titular = titular;
	}

	// metodos get e set para manipular os atributos da classe
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	// metodo utilizado para evitar a impressao do endereço de memória
	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", quantidade=" + quantidade + "]";
	}

	// método utilizado para depositar valores na conta
	public void depositar(double depositarValor) {
		if (depositarValor > 0) {
			quantidade += depositarValor;
		}

	}

	// metodo utilizado para retirar valores da conta
	public void retirar(double retirarValor) {
		if ((quantidade - retirarValor) > 0) {
			quantidade -= retirarValor;
		}

	}

}
