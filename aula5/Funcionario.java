package com.paradigmas.lab.aula5;

public class Funcionario {
	private String cargo;
	private float salario;
	
	public Funcionario(String cargo, float salario) {
		super();
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	

}
