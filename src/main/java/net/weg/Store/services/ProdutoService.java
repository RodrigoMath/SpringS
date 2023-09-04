package net.weg.Store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.weg.Store.DTO.DadosProduto;
import net.weg.Store.DTO.DadosProdutoPostagem;
import net.weg.Store.Repository.ClienteRepository;
import net.weg.Store.Repository.ProdutoRepository;
import net.weg.Store.domain.Produto;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository produtoRepo;
	
	@Autowired
	ClienteRepository clienteRepo;
	
	public void cadastrarProduto(DadosProdutoPostagem dados) {
		if(dados.getValor()>0 && dados.getQuantidade()>0) { 
			var produto= dados.adicionarProduto();
			produtoRepo.save(produto);
		}
	}
}
			
