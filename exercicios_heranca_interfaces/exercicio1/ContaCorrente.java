// Exercicio1

package com.paradigmas.lab.exercicios_heranca_interfaces.exercicio1;

public class ContaCorrente {
	private double saldo;
	private double taxa = 0.005;
	
	
	public ContaCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public void setSaldo(double valor) {saldo = this.getSaldo() + valor;}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valorDeposito) {
		this.setSaldo(valorDeposito);
		System.out.println("Deposito realizado!");
		}
	
	public void sacar(double valorSaque) {
		double desconto = 0;
		if(valorSaque > this.getSaldo()) {
			System.out.println("Saldo Insuficiente!");
		}else{
			desconto = valorSaque + valorSaque*taxa;
			this.setSaldo(-desconto);
			System.out.println("Saque Realizado.");
		}
	}
}
