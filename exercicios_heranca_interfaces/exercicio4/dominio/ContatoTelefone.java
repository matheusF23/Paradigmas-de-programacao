package com.paradigmas.lab.exercicios_heranca_interfaces.exercicio4.dominio;

public abstract class ContatoTelefone implements Contato{

	private String nome;
	private String contato;
	private String tipo;
	
	public ContatoTelefone(String nome, String contato, String tipo) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.tipo = tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getContato() {
		return this.contato;
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}
	
}
