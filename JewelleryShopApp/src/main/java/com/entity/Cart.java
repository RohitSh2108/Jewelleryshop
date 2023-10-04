package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue
	private int cartId;

	@OneToOne
    private User user;
    private List<Product> products;
    private int cartItemQuantity;
    private double cartTotalPrice;

    @OneToMany (cascade=CascadeType.ALL)
    Product product;

    @OneToOne(cascade=CascadeType.ALL)
    Order order;

    public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getCartItemQuantity() {
		return cartItemQuantity;
	}
	public void setCartItemQuantity(int cartItemQuantity) {
		this.cartItemQuantity = cartItemQuantity;
	}
	public double getCartTotalPrice() {
		return cartTotalPrice;
	}
	public void setCartTotalPrice(double cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", user=" + user + ", products=" + products + ", cartItemQuantity="
				+ cartItemQuantity + ", cartTotalPrice=" + cartTotalPrice + "]";
	}

}
