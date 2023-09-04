package net.weg.Store.DTO;

import org.antlr.v4.runtime.misc.NotNull;

import net.weg.Store.domain.Cliente;


public record DadosCliente(
		@NotNull
		String nome,
		Double money) {
		
	
}
