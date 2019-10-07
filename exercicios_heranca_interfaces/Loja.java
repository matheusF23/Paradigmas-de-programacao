package com.paradigmas.lab.exercicios_heranca_interfaces;

import java.util.Arrays;
import java.util.List;

public class Loja {
	
	public static void main(String[] args) {
		
		List<LojaEstoque> produtos = Arrays.asList(
				new LojaLivro("Um curso de Cálculo", 100, 12345, "Guidorizzi"),
				new LojaCD("Jorgin do pagode", 300, 44532, 1),
				new LojaDVD("Avengers", 100,54263, 3),
				new LojaCD("Jorgin do pagode 2", 300, 44532, 1));
		for(LojaEstoque prod : produtos) {
			System.out.println(prod);
		}
		
		boolean test = (produtos.get(2)).equals(produtos.get(3));
		System.out.println(test);
		boolean test1 = (produtos.get(1)).equals(produtos.get(3));
		System.out.println(test1);
	}
}
