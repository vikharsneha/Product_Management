package com.srv.productmanagement.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.srv.productmanagement.entity.Product;

@Repository
public class ProductDao_Impl implements ProductDao
{
	@Autowired
	SessionFactory factory;

	@Override
	public Boolean saveProduct(Product product) 
	{
		Boolean msg=false;
		try
		{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(product);
		transaction.commit();
		msg=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public Product getProductByID(int product_ID) 
	{
		Product product=null;
		try
		{
			Session session=factory.openSession();
		    product=session.get(Product.class, product_ID);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public List<Product> getAllProduct() 
	{
		List<Product> products=null;
		Session session=null;
		try
		{
		    session=factory.openSession();
			Criteria criteria=session.createCriteria(Product.class);
			 products=criteria.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return products;
	}

	@Override
	public Boolean deleteProductByProductId(int product_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
