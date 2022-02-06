package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista <T> {
	private T[] elementos;
	private int tamanho; // controla o tamanho real do vetor

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; // Solução do livro effective java
		this.tamanho = 0;
	}
	
//	public Lista( int capacidade, Class<T>) {
//		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
//		this.tamanho = 0;
//	}
	
	public Lista(){
		this(10);
	}
	
	public boolean adiciona(T elemento) {
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
	public boolean adiciona (int posicao, T elemento) {
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

	public void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
		}
	}
	
	public T obtem(int posicao) {
		return this.busca(posicao);
	}

	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		} 
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i=0 ; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		} 
		return -1;
	}
	
	public int ultimoIndice(T elemento){
		
		for (int i=this.tamanho-1; i>=0; i--){
			if (this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	
	public boolean contem(T elemento) {
//		int por = busca(elemento;)if (pos >-1) {
//			return true;
//		}
//		return false;
		return busca(elemento)>-1; // ou >=0
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
	
	public void remove(T elemento) {
		int pos = this.busca(elemento);
		if (pos > -1) {
			this.remove(pos);
		}
	}
	
	public void limpar() {
		// opção 01
		this.elementos = (T[]) new Object[this.elementos.length];
		
//		// opção 02
//		this.tamanho = 0;
//		
//		// opção 03
//		for (int i=0; i< this.tamanho; i++) {
//			this.elementos[i] = null;
//		}
//		this.tamanho = 0;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		//			String s = "[";
		for (int i=0; i<this.tamanho-1; i++) {
			//				s += this.elementos[i]; // modo mais "arcaico"
			//				s += ", "; 
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if(this.tamanho>0) {
			//				s += this.elementos[this.tamanho-1];
			s.append(this.elementos[this.tamanho-1]);
		}
		//			s+= "]";
		s.append("]");
		//			return Arrays.toString(elementos);
		return s.toString();
	}
}