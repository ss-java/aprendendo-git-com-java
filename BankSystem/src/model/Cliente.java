package model;

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
	private Conta conta;
	
	/**
	 * Construtor.
	 * 
	 * @param nome
	 * @param sobrenome
	 */
	public Cliente(Conta conta, String nome, String sobrenome) {
		this.conta = conta;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
}
