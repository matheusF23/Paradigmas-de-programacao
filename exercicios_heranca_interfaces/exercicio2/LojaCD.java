package com.paradigmas.lab.exercicios_heranca_interfaces.exercicio2;

public class LojaCD extends LojaEstoque{

	private int numeroFaixas;
	
	public LojaCD(String nome, double preco,int codBarras, int numFaixas) {
		super(nome, preco, codBarras);
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
		return "Código de barras: " + this.getCodBarras() + ". Nome do CD: " + this.getNome() + 
				". Número de faixas: " + this.numeroFaixas + ". Preco: R$ " + this.getPreco() + ".";
	}
	
	

}
