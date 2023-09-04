package net.weg.Store.DTO;

import net.weg.Store.domain.Produto;

public class DadosProduto {
	private Long id;

	private int quantidade;

	private String nome;

	private Double valor;

	public DadosProduto(Long id, int quantidade, String nome, Double valor) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.nome = nome;
		this.valor = valor;
	}
	
	public DadosProduto(Produto produto) {
		this.id= produto.getId();
		this.nome= produto.getNome();
		this.quantidade= produto.getQuantidade();
		this.valor= produto.getValor();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
