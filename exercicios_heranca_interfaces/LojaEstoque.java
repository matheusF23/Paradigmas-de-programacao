package com.paradigmas.lab.exercicios_heranca_interfaces;

import java.util.ArrayList;
import java.util.List;

public class LojaEstoque {
	private String nome;
	private double preco;
	private List<LojaEstoque> produtos;
	
	
	public LojaEstoque(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
		produtos = new ArrayList<LojaEstoque>();
	}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public double getPreco() {return preco;}
	public void setPreco(double preco) {this.preco = preco;}
	
	
}
