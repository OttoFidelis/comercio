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

	List<Produto> produtos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto produto = new Produto(); 
		produto.setNome("Televisor 70' Samsung");
		produto.setCodigoBarras("1321454357875334566532");
		produto.setPreco(6541.25);
		
		return "produtos";
	}
	@GetMapping("/novo-produto")
	public String novoProduto() {
		return "novo-produto";
	}
}
