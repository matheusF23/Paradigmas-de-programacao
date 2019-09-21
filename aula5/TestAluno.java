package com.paradigmas.lab.aula5;

public class TestAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Jorge", 345231345-3, "06-12-98");
		Aluno aluno2 = new Aluno("Gilson", 123227383-5, "26-10-97");
		
		System.out.println(aluno1.getNome() + ", " + aluno1.getRG() +", " + aluno1.getDataNasc());
		System.out.println(aluno2.getNome() + ", " + aluno2.getRG() +", " + aluno2.getDataNasc());

	}

}
