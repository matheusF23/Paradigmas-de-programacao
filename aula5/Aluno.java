package com.paradigmas.lab.aula5;

public class Aluno {
	private String nome;
	private int RG;
	private String dataNasc;
	
	public Aluno(String nome, int RG, String dataNasc) {
		super();
		this.nome = nome;
		this.RG = RG;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	

}
