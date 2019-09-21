package com.paradigmas.lab.aula5;

public class Turma {
	
	private int periodo;
	private int serie;
	private String sigla;
	private String tipoDeEnsino;
	
	public Turma(int periodo, int serie, String sigla, String tipoDeEnsino) {
		super();
		this.periodo = periodo;
		this.serie = serie;
		this.sigla = sigla;
		this.tipoDeEnsino = tipoDeEnsino;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTipoDeEnsino() {
		return tipoDeEnsino;
	}

	public void setTipoDeEnsino(String tipoDeEnsino) {
		this.tipoDeEnsino = tipoDeEnsino;
	}
	
	

}
