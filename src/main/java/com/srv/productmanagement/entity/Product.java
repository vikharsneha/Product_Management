package com.srv.productmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")//@Table is used if table name and entity class name is different
public class Product 
{
	@Id
	@Column(nullable=false,unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_ID;
	private String product_Name;
	private int supplier_ID;
	private String quantity_Per_Unit;
	private long product_Price;
	private int product_In_Stock;
	
	

	public Product() {
		super();
	}

	public Product(int product_ID, String product_Name, int supplier_ID, String quantity_Per_Unit,
			long product_Price, int product_In_Stock) {
		super();
		this.product_ID = product_ID;
		this.product_Name = product_Name;
		this.supplier_ID = supplier_ID;
		this.quantity_Per_Unit = quantity_Per_Unit;
		this.product_Price = product_Price;
		this.product_In_Stock = product_In_Stock;
	}

	public int getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(int product_ID) {
		this.product_ID = product_ID;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public int getSupplier_ID() {
		return supplier_ID;
	}

	public void setSupplier_ID(int supplier_ID) {
		this.supplier_ID = supplier_ID;
	}

	public String getQuantity_Per_Unit() {
		return quantity_Per_Unit;
	}

	public void setQuantity_Per_Unit(String quantity_Per_Unit) {
		this.quantity_Per_Unit = quantity_Per_Unit;
	}

	public long getProduct_Price() {
		return product_Price;
	}

	public void setProduct_Price(long product_Price) {
		this.product_Price = product_Price;
	}

	public int getProduct_In_Stock() {
		return product_In_Stock;
	}

	public void setProduct_In_Stock(int product_In_Stock) {
		this.product_In_Stock = product_In_Stock;
	}

	@Override
	public String toString() {
		return "Product [product_ID=" + product_ID + ", product_Name=" + product_Name + ", supplier_ID=" + supplier_ID
				+ ", quantity_Per_Unit=" + quantity_Per_Unit + ", product_Price=" + product_Price
				+ ", product_In_Stock=" + product_In_Stock + "]";
	}
	
	

}
