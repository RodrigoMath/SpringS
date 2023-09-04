package net.weg.Store.DTO;

import net.weg.Store.domain.Produto;

public class DadosProdutoPostagem {

	private int quantidade;

	private String nome;

	private Double valor;

	public Produto adicionarProduto() {
		return new Produto(quantidade, nome,  valor);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	
	
	

}
