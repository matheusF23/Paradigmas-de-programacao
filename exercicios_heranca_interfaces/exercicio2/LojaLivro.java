package com.paradigmas.lab.exercicios_heranca_interfaces.exercicio2;

public class LojaLivro extends LojaEstoque{
	
	private String autor;
	
	public LojaLivro(String nome, double preco, int codBarras, String autor) {
		super(nome, preco, codBarras);
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
		return "Código de barras: " + this.getCodBarras() + ". Livro: " + this.getNome() + 
				". Autor: " + this.getAutor() + ". Preco: R$ " + this.getPreco() + ".";
	}
		
	
}
