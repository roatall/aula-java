package banco.entidades;

import banco.enums.TipoConta;

public abstract class Conta {
	private int numConta;
	private double saldo, limite;
	private Pessoa donoConta;
	private Conta conta;
	private TipoConta tipoConta;

	public Conta() {

	}

//	public Conta(int numConta, double saldo, double limite, Pessoa donoConta) {
//		this.numConta = numConta;
//		this.saldo = saldo;
//		this.limite = limite;
//		this.donoConta = donoConta;
//
//	}
	public Conta(int numConta, double saldo, double limite, Pessoa donoConta, TipoConta tipoConta) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.limite = limite;
		this.donoConta = donoConta;
		this.tipoConta = tipoConta;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo2() {
		return saldo;
	}

	public void setSaldo2(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void gerarLimite() {
		this.setLimite(this.getSaldo() > 500.00 ? 300.00 : 100.00);
	}

	public Pessoa getDonoConta() {
		return donoConta;
	}

	public void setDonoConta(Pessoa donoConta) {
		this.donoConta = donoConta;
	}

	public void saque(double valor) {
		if (valor < limite) {
			this.gerarLimite();
			saldo -= valor;

		} else if (valor > limite) {
			System.out.println("Esse valor não pode ser sacado.");
		}
	}

	public void deposito(double valor) {
		this.setSaldo(this.getSaldo() + valor);

	}

	public void tranferencia(Conta contaReceptora, double valorTransferencia) {
		saldo -= valorTransferencia;
//		contaReceptora.setSaldo(this.getSaldo() + valorTransferencia);
		contaReceptora.deposito(valorTransferencia);
//		contaReceptora.gerarLimite();
	}
	
	public void setTipoConta(int codigo) {
        switch(codigo) {
            case 1: this.tipoConta = TipoConta.CORRENTE;
                break;
            case 2: this.tipoConta = TipoConta.POUPANCA;
                break;
            default:
                break;
        }
    }
	
		
	
	@Override
	public String toString() {
		String extrato = "Nome: " + this.getDonoConta().getNome() + "\n" + "Número do Cpf: "
				+ this.getDonoConta().getCpf() + "\n" +
				"Numero da Conta: " + this.getNumConta() + "\n";
		return extrato;
	}
}
