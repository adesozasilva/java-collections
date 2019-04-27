package br.com.adesozasilva.sets;

import static junit.framework.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;

public class InsereEbuscaElementosTest {

	@Test
	public void setsDeveBuscarElementosMaisRapidoDoqueNoArrayList() {
		Collection<Integer> numeros = new HashSet<>();
		long tempoComSets = InsereEbuscaElementos.executa(numeros);
		
		numeros = new ArrayList<>();
		long tempoComArrayList = InsereEbuscaElementos.executa(numeros);
		
		System.out.println("Tempo com ArrayList: " + tempoComArrayList);
		System.out.println("Tempo com Sets: " + tempoComSets);
		
		assertTrue(tempoComSets < tempoComArrayList);
		
	}

}
