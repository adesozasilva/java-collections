package br.com.adesozasilva.listas;

import java.util.List;

public class RemoveList {

	public static long removePrimeirosElementos(List<Integer> numeros) {
		long ini = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			numeros.remove(i); 
		}
		long fim = System.currentTimeMillis();
		return fim-ini;
	}

}
