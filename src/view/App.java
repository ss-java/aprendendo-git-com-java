package view;

import model.Agencia;
import model.Cliente;
import model.Conta;

public class App {

	public static void main(String[] args) {
		System.out.println("+------------------------------+");
		System.out.println("|        BANCO UNI-BH          |");
		System.out.println("+------------------------------+");
		System.out.println("| 1. Criar Cliente             |");
		System.out.println("+------------------------------+");
		
		Agencia agencia = new Agencia();
		Conta conta = new Conta(agencia, "1234");
		Conta conta1 = new Conta(agencia, "4321");
		Cliente cli = new Cliente(conta, "NomeCliBoladao","SobrenomeBoladao");
		System.out.println("Nome: " + cli.getNome() + " Numero Agencia: " + cli.getConta().get(0).getNumero());
		cli.addConta(conta1);
		System.out.println("Nome: " + cli.getNome() + " Numero Agencia: " + cli.getConta().get(1).getNumero());
		conta1.depositar(20);
		conta1.sacar(30);
	}

}
