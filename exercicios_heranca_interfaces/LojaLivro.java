package com.paradigmas.lab.exercicios_heranca_interfaces;

public class LojaLivro extends LojaEstoque{
	
	private String autor;
	
	public LojaLivro(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Livro: " + this.getNome() + ". Autor: " + this.getAutor() + ". Preco: R$ " + this.getPreco() + ".";
	}
		
	
}
