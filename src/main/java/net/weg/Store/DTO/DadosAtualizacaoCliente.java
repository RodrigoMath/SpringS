package net.weg.Store.DTO;

import net.weg.Store.domain.Cliente;

public class DadosAtualizacaoCliente {

	
	private Long id;

	private String name;
	
	private Double money;
	
	public DadosAtualizacaoCliente() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public DadosAtualizacaoCliente(Long id, String name, Double money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}

	
	
	



	
}
