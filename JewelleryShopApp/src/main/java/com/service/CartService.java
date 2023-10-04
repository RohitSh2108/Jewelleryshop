package com.service;

import com.entity.Cart;
import com.entity.Product;

public interface CartService {
	
	//use throws for throwing appropriate Exceptions with functions
		public Cart addToCart(Cart cart);

		public Cart updateCart(Cart cart);

		public String deleteProduct(Product product);

}
