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
	 * O valor contido na conta. 
	 */
	private double saldo;

	/**
	 * Construtor.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(Agencia agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;

	}
	
	public double GetSaldo() {
		
		return this.saldo;
	}

	

	/**
	 *  metodo para sacar
	 * @param valor
	 */
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;

	}

	/**
	 *  metodo para depositar
	 * @param valor
	 */
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;

	}
	
	

}
