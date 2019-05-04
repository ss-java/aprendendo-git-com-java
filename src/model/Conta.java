package model;

public class Conta {
	/**
	 * A agência onde a conta está cadastrada.
	 */
	private Agencia agencia;
	
	/**
	 * O número da conta.
	 */
	private String numero;
	
	/**
	 * Construtor.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(Agencia agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public Agencia getAgencia() {
		return this.agencia;
	}
	
	public String getNumero() {
		return this.numero;
	}
}
