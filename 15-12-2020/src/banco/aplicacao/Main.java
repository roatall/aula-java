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
		
		System.out.println("Digite o nome: ");
		conta.getDonoConta().setNome(teclado.next());
		teclado.next();
		System.out.println("Digite o cpf: ");
		conta.getDonoConta().setCpf(teclado.next());
		
		System.out.println("Digite o Numero da conta: ");
		conta.setNumConta(teclado.nextInt());
		ContaDAO contaDAO = new ContaDAO();
		contaDAO.inserir(conta);
		System.out.println("Contato salvo com sucesso!");
		
		
		
		}
		List<Conta> contasCadastradas = new ArrayList<>();	
		Agencia agencia = new Agencia();
		Conta conta2 = new Corrente(123, 0.00, 0.00, new Pessoa("Carla", "2234455"), TipoConta.CORRENTE);
		Conta conta3 = new Poupanca(124, 0.00, 0.00, new Pessoa("Meire", "3234455"), TipoConta.POUPANCA);
		//contasCadastradas.addAll(Arrays.asList(conta, conta1, conta2, conta3));
		System.out.println("Bem vindo!\n");
		System.out.println("Digite (c) para criar conta.");
				
		
		while(true) {
			char digito = teclado.next().charAt(0);
			
			if (digito == 'd'){
			 
			}
			else if(digito == 's') {
				
			}
			else if(digito == 't') {
				
			}
			else if(digito == 'c') {
				agencia.criarConta();
				System.out.println("Digite (d) para deposito ou Digite (s) para saque ou Digite (t) para transferencia: \n");
			}
			else {
				System.out.println("Digito não reconhecido");
			}
		}
		
	}			
}	           


