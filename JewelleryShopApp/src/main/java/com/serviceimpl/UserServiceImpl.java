package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dto.UserDTO;
import com.entity.Cart;
import com.entity.User;
import com.repository.UserRepository;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userrepo;

	@Override
	public User registerCustomer(User user) {
		// TODO Auto-generated method stub
		userrepo.save(user);
		return user;
	}

	@Override
	public User updateCustomer(User user) {
		// TODO Auto-generated method stub
		int id= user.getUserId();
		User u= userrepo.findById(id).orElse(null);
		u.setUserName(user.getUserName());
		u.setPassword(user.getPassword());
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
		u.setAddress(user.getAddress());
		u.setMobileNumber(user.getMobileNumber());
        userrepo.save(u);
		return u;
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		User u= userrepo.getByEmaile(email);
		return u;
	}

	@Override
	public Cart getCartByCustomer(int userId) {
		// TODO Auto-generated method stub
		Cart c= userrepo.getCartByCustomere(userId);
		return c;
	}

	@Override
	public User signIn(String userName, String password) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String signOut() {
		// TODO Auto-generated method stub
		return null;
	}

}
