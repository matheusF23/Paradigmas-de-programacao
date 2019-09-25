package com.paradigmas.lab.exercicios_heranca_interfaces;

public class Loja {
	public static void main(String[] args) {
		
		LojaLivro livro = new LojaLivro("Um curso de Cálculo", 100, "Guidorizzi");
		LojaCD cd = new LojaCD("Jorgin do pagode", 300, 1);
		System.out.println(livro);
		System.out.println(cd);
	}
}
