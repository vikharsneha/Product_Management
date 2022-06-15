package com.srv.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.srv.productmanagement.entity.Product;
import com.srv.productmanagement.service.ProductService_Impl;

@RestController
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	private ProductService_Impl service;
	
	@PostMapping(value="/saveproduct")
	public ResponseEntity<String> saveProduct(@RequestBody Product product)
	{
		Boolean b=service.saveProduct(product);
		if(b==true)
		{
			return new ResponseEntity<String>("Saved!!!",HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<String>("operational error!!",HttpStatus.INTERNAL_SERVER_ERROR);	
		}			
	}
	
	@GetMapping(value="/getproductbyid")
	public ResponseEntity<Product> getProductById(@RequestParam int productid)
	{
		Product product=service.getProductByID(productid);
		if(product!=null) {
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Product>(product,HttpStatus.NO_CONTENT);
		}
		
	}
	
	@GetMapping(value="/getallproducts")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		List<Product> products=service.getAllProduct();
		if(!products.isEmpty())
		{
			return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
			
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		}
	}
}
