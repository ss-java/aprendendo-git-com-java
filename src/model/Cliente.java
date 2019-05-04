package model;

import java.util.ArrayList;

public class Cliente {
	/**
	 * O nome do cliente.
	 */
	private String nome;
	
	/**
	 * O(s) sobrenome(s) do cliente. Se mais de um, 
	 * são separados por espaço.
	 */
	private String sobrenome;
	
	/**
	 * A conta do cliente.
	 */
	private ArrayList<Conta> contas = new ArrayList<>();
	
	/**
	 * Construtor.
	 * 
	 * @param nome
	 * @param sobrenome
	 */
	public Cliente(Conta conta, String nome, String sobrenome) {
		this.addConta(conta);
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public ArrayList<Conta> getConta() {
		return this.contas;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
}
