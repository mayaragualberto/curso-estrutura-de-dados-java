package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(5);
		// Adiciona no final do vetor
		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		
		System.out.println("Vetor antes de remover: ");
		System.out.println(vetor);
		
		vetor.remove(1);
		System.out.println("Vetor depois de remover a letra da posição 1: ");		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento E");
		int pos = vetor.busca("E");
		if ( pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		System.out.println(vetor);
		
		System.out.println("Remover o elemento A");
		pos = vetor.busca("A");
		if ( pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		System.out.println(vetor);
	}

}
