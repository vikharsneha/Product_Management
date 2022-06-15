package com.srv.productmanagement.service;

import java.util.List;

import com.srv.productmanagement.entity.Product;

public interface ProductService 
{
	public Boolean saveProduct(Product product);
	public Product getProductByID(int product_ID);
	public List<Product> getAllProduct();
	public Boolean deleteProductByProductId(int product_ID);
	public Boolean updateProduct(Product product);

}
