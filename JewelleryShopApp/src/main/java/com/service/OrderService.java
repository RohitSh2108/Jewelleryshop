package com.service;

import java.util.List;

import com.entity.Order;

public interface OrderService {
	
	//use throws for throwing appropriate Exceptions with functions
		public Order addOrders(Order ordersDTO);

		public Order updateOrders(Order ordersDTO);

		public boolean deleteOrders(Order ordersDTO);

		public Order getById(int id);

		public List<Order> findAll();

		public List<Order> getOrderCustomerId(int customerId);

		public List<Order> getOrderCustomerEmail(int customerEmail);

		public List<Order> getOrderByStatus(String orderstatus);

}
