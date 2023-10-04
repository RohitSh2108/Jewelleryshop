package com.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.utility.OrderStatus;

@Entity
public class Order {
	
	@Id
	@GeneratedValue
	private int orderId;
    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private Cart cart;

    @OneToOne(cascade=CascadeType.ALL)


	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", date=" + date + ", status=" + status + ", cart=" + cart + "]";
	}

}
