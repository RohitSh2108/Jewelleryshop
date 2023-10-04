package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Cart;
import com.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User getByEmaile(String email);

	Cart getCartByCustomere(int userId);

}
