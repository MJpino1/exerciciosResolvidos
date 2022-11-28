package conta;

public class Main {

	public static void main(String[] args) {
		// linhas de comando para verficar se está funcionando as funcionalidades
		Conta conta;

		Conta mikel = new Conta("Mikel");
		mikel.depositar(100);

		System.out.println(mikel.getTitular());
		System.out.println(mikel.getQuantidade());

		mikel.retirar(25);
		System.out.println(mikel.getQuantidade());

	}

}
