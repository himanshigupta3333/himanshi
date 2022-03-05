package com.example.onlineshopping.onlineshopping.loadcatalog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshopping.onlineshopping.loadcatalog.repo.LoadProductCatalogRepo;
import com.example.onlineshopping.onlineshopping.loadcatalog.service.LoadProductCatalogService;
import com.example.onlineshopping.onlineshopping.model.Products;

@Service  
public class LoadProductCatalogServiceImpl implements LoadProductCatalogService{

	@Autowired  
	LoadProductCatalogRepo loadProductCatalogRepo;  
	
	@Override
	public List<Products> getAllProducts()   {  
		List<Products> products = new ArrayList<Products>();  
		loadProductCatalogRepo.findAll().forEach(product -> products.add(product));  
		return products;  
	}  
}
