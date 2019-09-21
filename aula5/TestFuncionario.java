package com.paradigmas.lab.aula5;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Professor", 3000);
		Funcionario func2 = new Funcionario("Diretor", 5435.34f);
		
		System.out.println(func1.getCargo() + ". Salário: " + func1.getSalario());
		System.out.println(func2.getCargo() + ". Salário: " + func2.getSalario());

	}

}
