package banco.entidades;

import banco.enums.TipoConta;

public class Poupanca extends Conta {
	private double taxa;
	
	public Poupanca() {
	}

	public Poupanca(int numConta, double saldo, double limite, Pessoa donoConta, TipoConta tipoConta) {
		super(numConta, saldo, limite, donoConta, tipoConta);
		this.taxa = 1.00;
	}

	
}
