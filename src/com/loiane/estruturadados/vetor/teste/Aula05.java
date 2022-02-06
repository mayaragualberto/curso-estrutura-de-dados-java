package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(10);
		vetor.adiciona("elemento 1"); // 0
		vetor.adiciona("elemento 2"); // 1
		vetor.adiciona("elemento 3"); // 2
		
		System.out.println("Elemento da posição 1:");
		System.out.println(vetor.busca(0));
		
		System.out.println("Elemento da posição 2:");
		System.out.println(vetor.busca(1));
		
		System.out.println("Elemento da posição 3:");
		System.out.println(vetor.busca(2));
	}

}
