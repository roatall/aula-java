package banco.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import banco.entidades.Agencia;
import banco.entidades.Conta;
import banco.entidades.Corrente;
import banco.entidades.Pessoa;
import banco.entidades.Poupanca;
import banco.enums.TipoConta;





public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);	
		Connection conn = new ConnectionFactory().getConnection();
		System.out.println("Conexão Aberto com Sucesso!");
		System.out.println("Deseja cadastrar no banco? (s) para Sim ou (n) para Não");
		char simnao = teclado.next().charAt(0);
		if(simnao == 's') {	
		Conta conta  = new Corrente();
		conta.getDonoConta().setNome("Mario Silva");
		conta.getDonoConta().setCpf("99433233456");
		conta.setNumConta(123456767);
		ContaDAO contaDAO = new ContaDAO();
		contaDAO.inserir(conta);
		System.out.println("Contato salvo com sucesso!");
		return;
//		Conta conta1 = new Corrente(123, 0.00, 0.00, new Pessoa("Carla", "2234455"), TipoConta.CORRENTE);
//		Conta conta2 = new Poupanca(124, 0.00, 0.00, new Pessoa("Meire", "3234455"), TipoConta.POUPANCA);
//		Conta conta3 = new Poupanca(125, 0.00, 0.00, new Pessoa("Ana", "4234455"), TipoConta.POUPANCA);
		
		}
		List<Conta> contasCadastradas = new ArrayList<>();	
		Agencia agencia = new Agencia();

		//contasCadastradas.addAll(Arrays.asList(conta, conta1, conta2, conta3));
		System.out.println("Bem vindo!\n");
		System.out.println("Digite (c) para criar conta.");
		System.out.println("Digite (d) para deposito ou Digite (s) para saque ou Digite (t) para transferencia: \n");		
		
		while(true) {
			char digito = teclado.next().charAt(0);
			
			if (digito == 'd'){
				
			}
			else if(digito == 's') {
				
			}
			else if(digito == 't') {
				
			}
			else if(digito == 'c') {
				//agencia.criarConta();
			}
			else {
				System.out.println("Digito não reconhecido");
			}
		}
		
//		System.out.println("Iniciando cadastro conta corrente");
//		System.out.println("Quantas contas Correntes");
//		int quantidadeContaCorrente = sc.nextInt();
//		for (int i = 0; i < quantidadeContaCorrente; i++) {			
//			Corrente conta = new Corrente();
//			String nome, cpf;	
//			System.out.println("Insira seu nome: ");
//			nome = sc.next();
//			System.out.println("Insira seu CPF: ");
//			cpf = sc.next();
//			Pessoa donoConta = new Pessoa(nome, cpf);
//			conta.setDonoConta(donoConta);
//			System.out.println("Numero da conta: ");
//			conta.setNumConta(sc.nextInt());
//			System.out.println("Numero da Agencia: ");
//			conta.setAgencia(sc.nextInt());	
//			System.out.println("Deposito incial: ");
//			conta.setSaldo(sc.nextDouble());			
//			contasCadastradas.add(conta);
//			
//		}
//		System.out.println("Iniciando cadastro conta Poupanca");	
//		System.out.println("Quantas contas Poupancas");
//		int quantidadeContaPoupanca = sc.nextInt();
//		for (int i = 0; i < quantidadeContaPoupanca; i++) {			
//			Corrente conta = new Corrente();
//			String nome, cpf;		
//			System.out.println("Insira seu nome: ");
//			nome = sc.next();
//			System.out.println("Insira seu CPF: ");
//			cpf = sc.next();
//			Pessoa donoConta = new Pessoa(nome, cpf);
//			conta.setDonoConta(donoConta);
//			System.out.println("Numero da conta: ");
//			conta.setNumConta(sc.nextInt());
//			System.out.println("Numero da Agencia: ");
//			conta.setAgencia(sc.nextInt());
//			System.out.println("Deposito incial: ");
//			conta.setSaldo(sc.nextDouble());
//			contasCadastradas.add(conta);
//		}
//			for (Conta conta : contasCadastradas) {
//				System.out.println(conta);
//			}
//			
//			for (int i = 0; i < contasCadastradas.size(); i++) {
//				System.out.println("Quanto voce quer depositar na conta "+ contasCadastradas.get(i).getDonoConta().getNome()); 
//				double quantidade = sc.nextDouble();
//				contasCadastradas.get(i).deposito(quantidade);					
//			}
//			for (int i = 0; i < contasCadastradas.size(); i++) {
//				System.out.println("Quato voce quer sacar na conta "+ contasCadastradas.get(i).getDonoConta().getNome()); 
//				double quantidade = sc.nextDouble();
//				contasCadastradas.get(i).saque(quantidade);					
//			}
//
//			for (int i = 0; i < contasCadastradas.size(); i++) {
//				System.out.println("Quanto voce quer transferir "+ contasCadastradas.get(i).getDonoConta().getNome()); 
//				double quantidade = sc.nextDouble();
//				contasCadastradas.get(i).setSaldo(quantidade);					
//			}
	}			
}	           


