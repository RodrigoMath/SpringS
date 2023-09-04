package net.weg.Store.DTO;import ch.qos.logback.core.net.server.Client;
import net.weg.Store.domain.Cliente;

public record DadosListagemCliente(String nome, Double money, Long id) {
	
	public DadosListagemCliente(Cliente cliente) {
		this(cliente.getName(),cliente.getMoney(), cliente.getId());
	}

}
