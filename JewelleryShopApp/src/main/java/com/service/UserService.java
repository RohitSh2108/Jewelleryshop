package com.service;

import com.dto.UserDTO;
import com.entity.Cart;
import com.entity.User;

public interface UserService {
	
	//use throws for throwing appropriate Exceptions with functions

		public User registerCustomer(User user);

		public User updateCustomer(User user);

		public User getByEmail(String email);

		public Cart getCartByCustomer(int userId);

		public User signIn(String userName, String password);

		public String signOut();

}
