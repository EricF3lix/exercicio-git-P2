package br.upe;

public class Produto{
	private String nome;
	private double preco;
	private Categoria categoria;
	
	public Produto (String nome, double preco, Categoria categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
	
	public double getPreco() {
		return this.preco;
	}
	public String getNome(){
		return this.nome;
	}
	
}