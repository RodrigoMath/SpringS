package net.weg.Store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import net.weg.Store.DTO.DadosAtualizacaoCliente;
import net.weg.Store.DTO.DadosCliente;
import net.weg.Store.DTO.DadosListagemCliente;
import net.weg.Store.Repository.ClienteRepository;
import net.weg.Store.domain.Cliente;
import net.weg.Store.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	ClienteRepository repository;
	@Autowired
	ClienteService service;

	
	@PostMapping
	@Transactional
	public void cadastrarCliente(@RequestBody DadosCliente dados) {
		service.cadastrarCliente(dados);
		repository.save(new Cliente(dados));
	}

	@GetMapping
	public List<DadosListagemCliente> mostraClientes() {
		return repository.findAll().stream().map(DadosListagemCliente::new).toList();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void deletarUsuario(@PathVariable Long id) {
		repository.deleteById(id); }	
	
	@PutMapping
	@Transactional
	public void atualizarUsuario(@RequestBody DadosAtualizacaoCliente dados) {
		var cliente =repository.getReferenceById(dados.getId());
		cliente.atualizarCliente(dados);
	}
	
	
	
}
	
