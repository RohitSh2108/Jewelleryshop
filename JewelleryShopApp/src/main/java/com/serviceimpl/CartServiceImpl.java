package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.Cart;
import com.entity.Product;
import com.repository.CartRepository;
import com.service.CartService;

public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartrepo;

	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		cartrepo.save(cart);
		return cart;
	}

	@Override
	public Cart updateCart(Cart cart) {
		// TODO Auto-generated method stub
		int id= cart.getCartId();
		Cart c= cartrepo.findById(id).orElse(null);
		c.setCartItemQuantity(cart.getCartItemQuantity());
		c.setCartTotalPrice(cart.getCartTotalPrice());
		cartrepo.save(c);
		return c;
	}

	@Override
	public String deleteProduct(Product product) {
		// TODO Auto-generated method stub
		int id= product.getProductId();
		cartrepo.deleteById(id);
		return "Deleted Successfully";
	}

}
