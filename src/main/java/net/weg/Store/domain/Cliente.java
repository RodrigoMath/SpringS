package net.weg.Store.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.weg.Store.DTO.DadosAtualizacaoCliente;
import net.weg.Store.DTO.DadosCliente;

@Entity @Getter @Setter  @AllArgsConstructor
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Double money;
	public Cliente() {
		
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
	
	public Cliente(DadosCliente dados) {
		this.name=dados.nome();
		this.money=dados.money();
	}
	
	public Cliente atualizarCliente(DadosAtualizacaoCliente dados) {
		Cliente cliente = new Cliente();
		cliente.id= dados.getId();
		cliente.name= dados.getName();
		cliente.money= dados.getMoney();
		return cliente;
	}
	
	
}
