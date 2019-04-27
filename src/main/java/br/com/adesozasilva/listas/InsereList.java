package br.com.adesozasilva.listas;

import java.util.List;

public class InsereList {

	public static long insereElementosNo(List<Integer> numeros, int quantidade) {
		long ini = System.currentTimeMillis();
		for (int i = 0; i < quantidade; i++) {
			numeros.add(0);
		}
		long fim = System.currentTimeMillis();
		return fim-ini;
	}

}
