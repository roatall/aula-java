import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, cpf, tipoConta;
		
		System.out.println("Insira seu nome: ");
		nome = sc.next();
		System.out.println("Insira seu CPF: ");
		cpf = sc.next();
		System.out.println("Insira tipo de conta: ");
		tipoConta = sc.next();
		
		Conta conta1 = new Conta(nome, cpf, tipoConta);
		
		Conta conta2 = new Conta("Roberto", "123456789", "corrente");
		
		System.out.println("Primeiro deposito: ");
		conta1.setSaldo(sc.nextDouble());
		
			System.out.println("EXTRATO");
	        System.out.printf("Nome: %s %n", conta1.getNomeCliente());
	        System.out.printf("Número do Cpf: %s%n",conta1.getCpf() );
	        System.out.printf("Saldo atual: %.2f%n",conta1.getSaldo());
	        System.out.printf("Tipo da conta: %s%n", conta1.getConta());
	        
	    System.out.println("-----------------------------------------------"); 
	    System.out.println("Quer Continuar?");    
	    String simnao = sc.next();
	    if (simnao.equals("sim")) 
	    {
	    	System.out.println("Escolha valor de Deposito:");
			conta1.Deposito(sc.nextDouble());
			
			System.out.println("Escolha valor de Saque:");
			conta1.Saque(sc.nextDouble());
			
	    }
	    
	    
	   
        System.out.println("Transferencia: ");
		double valor = sc.nextFloat();
		if (conta1.getConta().equals(conta2.getConta()))
		{
			conta1.Saque(valor);
			conta2.setSaldo(valor);
		}
	        
		System.out.println("Deseja ver o Extrato de outra conta?");
		String simnao2 = sc.next();
		 if (simnao2.equals("sim")) 
		    {
			 System.out.printf("Nome: %s %n", conta2.getNomeCliente());
		        System.out.printf("Número do Cpf: %s%n",conta2.getCpf() );
		        System.out.printf("Saldo atual: %.2f%n",conta2.getSaldo2());
		        System.out.printf("Tipo da conta: %s%n", conta2.getConta());
		        System.out.printf("Limite: %s %n", conta2.getLimite());				
		    }
		  
		   
		 	System.out.println("-----------------------------------------------"); 
	        System.out.printf("Nome: %s %n", conta1.getNomeCliente());
	        System.out.printf("Número do Cpf: %s%n",conta1.getCpf() );
	        System.out.printf("Saldo atual: %.2f%n",conta1.getSaldo());
	        System.out.printf("Tipo da conta: %s%n", conta1.getConta());
	        System.out.printf("Limite: %s %n", conta1.getLimite());
	        
	}
	

}
