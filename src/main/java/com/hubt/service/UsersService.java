package com.hubt.service;

import java.util.List;

import com.hubt.common.PageBean;
import com.hubt.model.Users;
import com.hubt.model.UsersPageList;


public interface UsersService {
    public List<Users> getUsers();
	
	public Users getUserById(String user_uuid);
	
	public void updateUser(Users users);
	
	public void addUser(Users users);
	
	public void deleteUser(String user_uuid);
	
	public PageBean<Users> findPageUsers(int curPage,int pageSize);
	
	public String findOrganName(String user_uuid);
	
	int getTatlo();

	public List<UsersPageList> getAll(UsersPageList usersPageList);
}
