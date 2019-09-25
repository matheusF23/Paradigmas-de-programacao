package com.paradigmas.lab.exercicios_heranca_interfaces;

public class LojaDVD extends LojaEstoque{

	private double duracao;
	
	public LojaDVD(String nome, double preco, double duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do DVD: " + this.getNome() + ". Duracao: " + this.duracao + ". Preco: R$ " + this.getPreco() + ".";
	}

}
