package com.paradigmas.lab.exercicios_heranca_interfaces.exercicio2;

public class LojaEstoque implements Comparable<LojaEstoque> {
	private String nome;
	private double preco;
	private int codBarras;
	
	public LojaEstoque(String nome, double preco, int codBarras) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
	}
	
	// Getters and Setters
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public double getPreco() {return preco;}
	public void setPreco(double preco) {this.preco = preco;}
	public int getCodBarras() {return codBarras;}
	public void setCodBarras(int codBarras) {this.codBarras = codBarras;}

	@Override
	public boolean equals(Object other) {
		return codBarras == ((LojaEstoque)other).getCodBarras();
	}

	@Override
	public int compareTo(LojaEstoque other) {
		return nome.compareTo(other.getNome());
	}
	
	
}
