package banco.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Agencia {
	
	private Conta contaGenerica = new Corrente();
	private List<Conta> todaConta = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	public Agencia() {
	}

	public List<Conta> getTodaConta() {
		return todaConta;
	}

	public void criarConta() {
		System.out.println();
		System.out.println("Digite o nome do titular: ");
		String nome = sc.next();
		System.out.println("Digite o n� CPF do titlular da conta: ");
		String cpf = sc.next();
		int numConta = sc.nextInt();
		contaGenerica.getDonoConta().setNome(nome);
		contaGenerica.getDonoConta().setCpf(cpf);
		contaGenerica.getNumConta();

//		System.out.println(contaGenerica.toString());

		todaConta.add(contaGenerica);
		System.out.println("Conta criada com sucesso\n");

		System.out.println("Deseja fazer um dep�sito inicial? Digite s para Sim OU n para N�o");
		char resposta = sc.next().charAt(0);

		if (resposta == 's') {
			System.out.println("Digite o valor a do dep�stio inicial: \n");
			double valor = sc.nextDouble();
			contaGenerica.deposito(valor);
			System.out.println(contaGenerica);
		}

		else if (resposta == 'n') {
			System.out.println("Volte sempre.");
		}
	}

	public List<Conta> consultarContas() {

		System.out.println("Digite o n�mero da conta: ");
		Integer numeroDaConta = sc.nextInt();
		List<Conta> busca = this.todaConta.stream().filter(x -> x.getNumConta() == numeroDaConta)
				.collect(Collectors.toList());

		System.out.println(busca);
		return busca;
	}

	public Conta buscarConta(Integer numeroConta) {

		Conta contaBusc = this.getTodaConta().stream().filter(x -> x.getNumConta() == numeroConta)
				.findFirst().orElse(null);
		return contaBusc;
	}
}
