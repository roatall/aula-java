package banco.entidades;

import banco.enums.TipoConta;

public class Corrente extends Conta {
	
	private double taxa;
	
	public Corrente() {
	}

	public Corrente(int numConta, double saldo, double limite, Pessoa donoConta, TipoConta tipoConta) {
		super(numConta, saldo, limite, donoConta, tipoConta);
		this.taxa = 1.00;
	}
	
	
}
