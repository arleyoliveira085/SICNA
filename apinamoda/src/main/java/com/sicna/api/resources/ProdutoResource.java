package com.sicna.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sicna.api.repository.ProdutoRepository;


import com.sicna.api.models.Produto;

@RestController
@RequestMapping(value ="/api")
public class ProdutoResource {

		@Autowired
		ProdutoRepository produtoRepository;
		
		@GetMapping("/produtos")
		public List<Produto> listaProdutos(){
			
			return produtoRepository.findAll();
		}
		
		@PostMapping("/produto")
		public Produto salvaProduto(@RequestBody Produto produto){
			
			return produtoRepository.save(produto);
		}
}
