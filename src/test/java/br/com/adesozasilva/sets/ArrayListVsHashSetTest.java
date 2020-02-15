package br.com.adesozasilva.sets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ArrayListVsHashSetTest {

	@Test
	public void setsDeveBuscarElementosMaisRapidoDoqueNoArrayList() {
		Collection<Integer> numeros = new HashSet<>();
		long tempoComSets = InsereEbuscaElementos.executa(numeros);

		numeros = new ArrayList<>();
		long tempoComArrayList = InsereEbuscaElementos.executa(numeros);

		System.out.println("Tempo com ArrayList: " + tempoComArrayList);
		System.out.println("Tempo com Sets: " + tempoComSets);

		Assert.assertTrue(tempoComSets < tempoComArrayList);

	}

}
