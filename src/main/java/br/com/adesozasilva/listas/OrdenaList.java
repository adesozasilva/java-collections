package br.com.adesozasilva.listas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.adesozasilva.listas.model.Produto;

public class OrdenaList {
	
	public static void main(String[] args) {
		List<Produto> produtos = Arrays.asList(
				new Produto(3, "Bandeira", 100),
				new Produto(1, "Apito", 300),
				new Produto(2, "Morteiro", 400)
				);
		produtos.forEach(System.out::println);
		Collections.sort(produtos);
		System.out.println("\nDepois de ordenado ");
		produtos.forEach(System.out::println);
		
		int quantidadeTotalDeProdutos = produtos.stream().mapToInt(Produto::getQuantidade).sum();
		
		System.out.println(quantidadeTotalDeProdutos);
		
	}

}
