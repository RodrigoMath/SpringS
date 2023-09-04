package net.weg.Store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.weg.Store.DTO.DadosListagemCliente;
import net.weg.Store.DTO.DadosProduto;
import net.weg.Store.DTO.DadosProdutoPostagem;
import net.weg.Store.Repository.ProdutoRepository;
import net.weg.Store.domain.Produto;
import net.weg.Store.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository repository;
	
	@Autowired
	ProdutoService service;

	@GetMapping
	public List<DadosProduto> mostraProduto() {
		return repository.findAll().stream().map(DadosProduto::new).toList();
	}
	
	@PostMapping
	@Transactional
	public void adicionarProduto(@RequestBody DadosProdutoPostagem dados) {
		service.cadastrarProduto(dados);
		
		/*
		 * var produto = dados.adicionarProduto(); repository.save(produto);
		 */
	}
	
}
