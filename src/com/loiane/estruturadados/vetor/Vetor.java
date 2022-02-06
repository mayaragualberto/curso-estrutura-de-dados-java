package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho; // controla o tamanho real do vetor
	
	public Vetor( int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho =0;
	}
	
//	public void adiciona(String elemento) {
//		for (int i=0; i<this.elementos.length;i++) {
//			if (this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				break;
//			}
//		}
//	}
//	public void adiciona(String elemento) throws Exception {
//		if (this.tamanho < this.elementos.length) {
//			this.elementos[this.tamanho] = elemento;
//			this.tamanho++;	
//		} else {
//			throw new Exception ("Vetor já está cheio, não é possível adicionar mais elementos.");
//		}
//	}
	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;	
			return true;
		} 
		return false;
	}
	
	// 0 1 2 3 4 5 6 -> tamanho é 5
	// B C E F G + +
	// 
	public boolean adiciona (int posicao, String elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		} 	
		// mover todos os elementos para a posição posterior
		for (int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		} 
		return this.elementos[posicao];
	}
	
	public int busca(String elemento) {
		for (int i=0 ; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		} 
		return -1;
	}
	
	
	// B G D E F -> posição a ser removida: 1, elemento G
	// 0 1 2 3 4 -> tamanho = 5
	// vetor[1]=vetor[2];
	// vetor[2]=vetor[3];
	// vetor[3]=vetor[4];
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		// mover todos os elementos para a posição anterior
		for (int i=posicao; i< this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}		
		this.tamanho--;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
//		String s = "[";
		for (int i=0; i<this.tamanho-1; i++) {
//			s += this.elementos[i]; // modo mais "arcaico"
//			s += ", "; 
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho>0) {
//			s += this.elementos[this.tamanho-1];
			s.append(this.elementos[this.tamanho-1]);
		}
//		s+= "]";
		s.append("]");
//		return Arrays.toString(elementos);
		return s.toString();
	}
	
	
}
