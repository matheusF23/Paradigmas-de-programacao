package com.paradigmas.lab.exercicios_heranca_interfaces;

import java.util.Arrays;
import java.util.List;

public class Loja {
	
	public static void main(String[] args) {
		
		LojaEstoque cdBom = new LojaCD("Gilsin dos teclados", 310, 23535, 1);
		
		List<LojaEstoque> produtos = Arrays.asList(
				new LojaLivro("Um curso de Cálculo", 100, 12345, "Guidorizzi"),
				new LojaCD("Jorgin do pagode", 300, 44532, 1),
				new LojaDVD("Avengers", 100,54263, 3),
				new LojaCD("Jorgin do pagode", 300, 44532, 1),
				cdBom);
		for(LojaEstoque prod : produtos) {
			System.out.println(prod);
		}
		
		// Teste de igualdade no codigo de barras
		boolean test = (produtos.get(2)).equals(produtos.get(3));
		System.out.println(test);
		boolean test1 = (produtos.get(1)).equals(produtos.get(3));
		System.out.println(test1);
		
		LojaEstoque cdBom1 = new LojaCD("Jorgin do pagode 3", 300, 44534, 1);
		buscaProd(cdBom, produtos);
		buscaProd(cdBom1, produtos);
	}
	
	// Metodo para buscar produtos
	public static void buscaProd(LojaEstoque produto, List<LojaEstoque> produtos) {
		int indice = -1;
		for (LojaEstoque p : produtos) {
			if (p.equals(produto)) {
				indice = produtos.indexOf(p);
				System.out.println("Posicao: " + indice);
				break;
			}
		}
		if(indice == -1) {
			System.out.println("Produto não encontrado!!!");
		}
	}
}
