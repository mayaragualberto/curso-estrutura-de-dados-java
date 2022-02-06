package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(10);
		// Adiciona no final do vetor
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println("Vetor antes de incluir: ");
		System.out.println(vetor);
		
		vetor.adiciona(0,"A");
		System.out.println("Vetor depois de incluir a letra A: ");		
		System.out.println(vetor);
		
		vetor.adiciona(3,"D");
		System.out.println("Vetor depois de incluir a letra D: ");		
		System.out.println(vetor);
	}

}
