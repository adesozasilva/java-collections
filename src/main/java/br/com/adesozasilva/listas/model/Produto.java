package br.com.adesozasilva.listas.model;

public class Produto implements Comparable<Produto> {
	
	private Integer id;
	private String name;
	private Integer quantidade;
	
	public Produto(Integer id, String name, Integer quantidade) {
		this.id = id;
		this.name = name;
		this.quantidade = quantidade;
	}
	

	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	@Override
	public String toString() {
		return "Produto: " + this.id + " " + this.name;
	}
	
	@Override
	public int compareTo(Produto outroProduto) {
		return Integer.compare(this.id, outroProduto.getId());
	}
	
	

}
