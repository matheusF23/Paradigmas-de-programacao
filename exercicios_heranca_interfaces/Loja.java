package com.paradigmas.lab.exercicios_heranca_interfaces;

import java.util.Arrays;
import java.util.List;

public class Loja {
	
	public static void main(String[] args) {
		
		List<LojaEstoque> produtos = Arrays.asList(new LojaLivro("Um curso de Cálculo", 100, "Guidorizzi"),
				new LojaCD("Jorgin do pagode", 300, 1),
				new LojaDVD("Avengers", 100, 3));
		for(LojaEstoque prod : produtos) {
			System.out.println(prod);
		}
		
	}
}
