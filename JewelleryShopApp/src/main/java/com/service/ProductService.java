package com.service;

import java.util.List;

import com.entity.Product;

public interface ProductService {
	
	//use throws for throwing appropriate Exceptions with functions
		public Product getById(int id);

		public Product updateProduct(Product product);

		public boolean deleteProduct(Product product);

		public Product addProduct(Product product);

		public List<Product> findAll();

		public List<Product> getProductByCustomer(int customerId);

		public List<Product> getProductByCategoryName(int categoryName);


}
