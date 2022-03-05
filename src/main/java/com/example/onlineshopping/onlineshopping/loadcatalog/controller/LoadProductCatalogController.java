package com.example.onlineshopping.onlineshopping.loadcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineshopping.onlineshopping.loadcatalog.service.LoadProductCatalogService;
import com.example.onlineshopping.onlineshopping.model.Products;

@RestController  
public class LoadProductCatalogController {
	
	@Autowired  
	LoadProductCatalogService loadProductCatalogService; 
	
	@GetMapping("/getProducts")  
	private List<Products> getAllProducts(){  
		return loadProductCatalogService.getAllProducts();  
	}  

}
