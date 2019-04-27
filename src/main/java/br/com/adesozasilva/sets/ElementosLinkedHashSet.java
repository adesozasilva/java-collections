package br.com.adesozasilva.sets;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

import br.com.adesozasilva.listas.model.Produto;

public class ElementosLinkedHashSet {
	
	public static void main(String[] args) {
		Collection<Produto> produtos = new HashSet<>();
		produtos.add(new Produto(3, "Bandeira", 100));
		produtos.add(new Produto(1, "Apito", 300));
		produtos.add(new Produto(2, "Morteiro", 400));
		
		produtos.forEach(System.out::println);
		
		produtos = new LinkedHashSet<>();
		produtos.add(new Produto(3, "Bandeira", 100));
		produtos.add(new Produto(1, "Apito", 300));
		produtos.add(new Produto(2, "Morteiro", 400));
		
		System.out.println();
		
		produtos.forEach(System.out::println);
		

    }

}