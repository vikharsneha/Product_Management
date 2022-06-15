package com.srv.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srv.productmanagement.dao.ProductDao_Impl;
import com.srv.productmanagement.entity.Product;

@Service
public class ProductService_Impl implements ProductService
{
	@Autowired
	private ProductDao_Impl dao;

	@Override
	public Boolean saveProduct(Product product) {
		Boolean msg=dao.saveProduct(product);
		return msg;
	}

	@Override
	public Product getProductByID(int product_ID) 
	{
		Product product=dao.getProductByID(product_ID);
		return product;
	}

	@Override
	public List<Product> getAllProduct() 
	{
		List<Product> products=dao.getAllProduct();
		return products;
	}

	@Override
	public Boolean deleteProductByProductId(int product_ID) {
		return null;
	}

	@Override
	public Boolean updateProduct(Product product) {
		return null;
	}
	

}
