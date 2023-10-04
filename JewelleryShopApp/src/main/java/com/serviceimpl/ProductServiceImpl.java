package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.Cart;
import com.entity.Product;
import com.repository.ProductRepository;
import com.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository prepo;

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		Product p= prepo.getByIde(id);
		return p;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		int id= product.getProductId();
		Product p= prepo.findById(id).orElse(null);
		p.setPrice(product.getPrice());
		p.setQuantity(product.getQuantity());
		prepo.save(p);
		return p;
		
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		if(prepo.existsById(product.getProductId()))
    	{
    		prepo.deleteById(product.getProductId());
    		return true;
    	}
		return false;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		prepo.save(product);
		return product;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> l= prepo.findAll();

		return l;
	}

	@Override
	public List<Product> getProductByCustomer(int customerId) {
		// TODO Auto-generated method stub
		List<Product> p= prepo.getProductByCustomere(customerId);
		return p;
	}

	@Override
	public List<Product> getProductByCategoryName(int categoryName) {
		// TODO Auto-generated method stub
		List<Product> p= prepo.getProductByCustomerNamee(categoryName);
		return p;
	}

}
