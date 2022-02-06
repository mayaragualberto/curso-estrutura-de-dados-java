package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "4567-7123", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "1267-7345", "contato3@email.com");
		
		vetor.adiciona(c1)
	}
}
