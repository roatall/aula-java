public class Conta
{
	private int numConta;
	private String nomeCliente,cpf, conta;
	private double saldo, limite;	

	
	public Conta(String nomeCliente, String cpf, String conta)
	{
		
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.conta = conta;
		saldo = 0;
		
	}
	

	
	public int getNumConta() {
		return numConta;
	}



	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getConta() {
		return conta;
	}



	public void setConta(String conta) {
		this.conta = conta;
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



	public void limite()
	{
		if (saldo >= 500)
		{
			limite = 300;
		}
		else
		{
			limite = 100;
		}
	}
	
	public void Saque(double valor)
	{
		if (valor > limite)
		{
			saldo -= valor;
		}
		
	}
	
	public void Deposito(double valor)
	{
		saldo += valor;
	}
}
