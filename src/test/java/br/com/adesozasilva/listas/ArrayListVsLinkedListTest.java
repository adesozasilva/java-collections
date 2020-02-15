package br.com.adesozasilva.listas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedListTest {
	
	private ArrayList<Integer> numerosArrayList;
	private LinkedList<Integer> numerosLinkedList;
	private int quantidadeElementos;

	@Before
	public void setUp()  {
		System.out.println("**** ArrayList vs LinkedList ***");
		numerosArrayList = new ArrayList<>();
		numerosLinkedList = new LinkedList<>();
		quantidadeElementos = 1000000;
		
	}

	@Test
	public void deveInserirElementosNoArrayListMaisRapidamenteDoQueLinkedList() {
		long tempoArrayList  = InsereList.insereElementosNo(numerosArrayList, quantidadeElementos);
		long tempoLinkedList = InsereList.insereElementosNo(numerosLinkedList, quantidadeElementos);

		System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
		System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);
		Assert.assertTrue(tempoArrayList < tempoLinkedList);

	}
	
	@Test
	public void linkedListDeveRemoveElementosNaPrimeiraPosicaoMaisRapidoQueArrayList() {
		InsereList.insereElementosNo(numerosArrayList, quantidadeElementos);
		InsereList.insereElementosNo(numerosLinkedList, quantidadeElementos);

		long tempoArrayList = RemoveList.removePrimeirosElementos(numerosArrayList);
		long tempoLinkedList = RemoveList.removePrimeirosElementos(numerosLinkedList);

		System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
		System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);
		Assert.assertTrue(tempoLinkedList < tempoArrayList);
	}

}
