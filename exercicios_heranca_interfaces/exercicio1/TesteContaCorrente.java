package com.paradigmas.lab.exercicios_heranca_interfaces.exercicio1;

public class TesteContaCorrente {

	public static void main(String[] args) {
		//Teste para um cliente normal:
		ContaCorrente normal = new ContaCorrente(500);
		
		System.out.println("Valor atual: " + normal.getSaldo());
		normal.depositar(50.00);
		System.out.println("Valor apos deposito: " + normal.getSaldo());
		normal.sacar(200);
		System.out.println("Valor apos saque: " + normal.getSaldo());
		
		
		// Teste para um cliente especial:
		System.out.println("\n----------------------------------\n");
		ClienteEspecial especial = new ClienteEspecial(500);
		System.out.println("Saldo do atual: " + especial.getSaldo());
		especial.depositar(50.00);
		System.out.println("Valor apos deposito: " + especial.getSaldo());
		especial.sacar(200);
		System.out.println("Valor apos saque: " + especial.getSaldo());
		
		
		
	}

}
