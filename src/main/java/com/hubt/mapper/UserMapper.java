package com.hubt.mapper;

import java.util.List;

import com.hubt.model.User;

public interface UserMapper {
	void saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findUserById(int id);

    List<User> findAll();
}
