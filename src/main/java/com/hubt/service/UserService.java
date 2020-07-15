package com.hubt.service;

import java.util.List;

import com.hubt.model.User;

public interface UserService {
	void saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findUserById(int id);

    List<User> findAll();

}
