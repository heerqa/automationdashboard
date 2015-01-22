package com.zoya.service;

import java.util.List;

import com.zoya.model.User;

public interface UserService {
	
	public boolean insertUser(User user);
	public List<User> getAllUsers();	
	public User getUserRow(int id);
	public boolean deletAllUser();
	public boolean deleteUserRow(int id);

}
