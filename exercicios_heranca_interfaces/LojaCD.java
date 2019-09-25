package com.paradigmas.lab.exercicios_heranca_interfaces;

public class LojaCD extends LojaEstoque{

	private int numeroFaixas;
	
	public LojaCD(String nome, double preco, int numFaixas) {
		super(nome, preco);
		this.numeroFaixas = numFaixas;
	}

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do CD: " + this.getNome() + ". Número de faixas: " + this.numeroFaixas + ". Preco: R$ " + this.getPreco() + ".";
	}
	
	

}
