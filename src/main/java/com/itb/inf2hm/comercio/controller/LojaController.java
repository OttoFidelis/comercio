package com.itb.inf2hm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2hm.comercio.model.Produto;


@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		Produto produto = new Produto(); 
		produto.setId(1231);
		produto.setNome("Televisor 70' Samsung");
		produto.setCodigoBarras("1321454357875334566532");
		produto.setPreco(6541.25);
		produto.setDescricao("televisor de setenta polegadas da marca Samsung");
		
		Produto produto2 = new Produto();
		produto2.setId(3213);
		produto2.setNome("Playstation");
		produto2.setCodigoBarras("12345654123654123465112");
		produto2.setPreco(10000.00);
		produto2.setDescricao("Videogame desenvolvido pela Sony");
		
		Produto produto3 = new Produto();
		produto3.setId(76543);
		produto3.setNome("Computador");
		produto3.setCodigoBarras("123456597587645741476523");
		produto3.setPreco(2345.99);
		produto3.setDescricao("Computador com processador intel celeron");
		//Adicionando os produtos no ArrayList
		
		listaDeProdutos.add(produto);
		listaDeProdutos.add(produto2);
		listaDeProdutos.add(produto3);
		model.addAttribute("listaDeProdutos",listaDeProdutos);
		return "produtos";
	}
	@GetMapping("/novo-prod")
	public String novoProduto() {
		return "novo-produto";
	}
}
