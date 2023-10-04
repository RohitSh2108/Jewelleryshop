package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product getByIde(int id);

	List<Product> getProductByCustomere(int customerId);

	List<Product> getProductByCustomerNamee(int categoryName);
	

}
