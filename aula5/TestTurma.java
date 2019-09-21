package com.paradigmas.lab.aula5;

public class TestTurma {

	public static void main(String[] args) {
		
		Turma paradigmas = new Turma(6, 4, "PP", "Presencial");
		Turma ingles = new Turma(3, 5, "ING", "EAD");
		
		System.out.println(paradigmas.getSigla() + ", periogo: " + paradigmas.getPeriodo() + ", série: " + paradigmas.getSerie()
		+ ", modalidade: " + paradigmas.getTipoDeEnsino());
		System.out.println(ingles.getSigla() + ", periogo: " + ingles.getPeriodo() + ", série: " + ingles.getSerie()
		+ ", modalidade: " + ingles.getTipoDeEnsino());

	}

}
