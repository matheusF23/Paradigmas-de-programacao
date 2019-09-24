// Exercicio1

package com.paradigmas.lab.exercicios_heranca_interfaces;

public class ClienteEspecial extends ContaCorrente {
	
	private double taxa = 0.001;
	
	public ClienteEspecial(double saldo) {
		super(saldo);
	}

	@Override
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
