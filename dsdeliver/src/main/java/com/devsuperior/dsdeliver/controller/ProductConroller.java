package com.devsuperior.dsdeliver.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.services.ProductService;

@RestController
@RequestMapping("/produto")
public class ProductConroller {
	
	
	@Autowired
	private ProductService productService;
	
	
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAll(){
		List<ProductDTO> list=productService.listar();
		return ResponseEntity.ok().body(list);
	}
	/*
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<ProductDTO> salvar(@Valid @RequestBody ProductDTO produto) {
		Product model = toEntity(produto);
		productService.salvar(model);
		return new ResponseEntity<>(toModel(model),HttpStatus.CREATED) ;
	}
	*/
	
	
	

}
