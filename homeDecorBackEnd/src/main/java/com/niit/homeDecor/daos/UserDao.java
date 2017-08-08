package com.niit.homeDecor.daos;

import com.niit.homeDecor.models.User;

public interface UserDao {
	public void insertUser(User user);
	public User getUser(String email,String pwd);

}
