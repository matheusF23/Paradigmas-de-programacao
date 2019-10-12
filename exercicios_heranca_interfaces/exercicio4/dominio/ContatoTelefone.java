package com.paradigmas.lab.exercicios_heranca_interfaces.exercicio4.dominio;

public class ContatoTelefone implements Contato{

	private String nome;
	private String contato;
	
	
	public ContatoTelefone(String nome, String contato) {
		super();
		this.nome = nome;
		this.contato = contato;
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
		return null;
	}
	
}
