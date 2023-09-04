package net.weg.Store.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import net.weg.Store.Enums.DescontoEnum;

@Entity
public class Loja {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	@Enumerated
	private DescontoEnum desconto;
	
	Loja(){
		
	}

	public Loja(String name, DescontoEnum desconto) {
		super();
		this.name = name;
		this.desconto = desconto;
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

	public DescontoEnum getDesconto() {
		return desconto;
	}

	public void setDesconto(DescontoEnum desconto) {
		this.desconto = desconto;
	}
	
}
