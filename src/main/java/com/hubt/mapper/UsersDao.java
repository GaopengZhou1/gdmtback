package com.hubt.mapper;

import java.util.List;
import java.util.Map;

import com.hubt.model.Users;
import com.hubt.model.UsersPageList;



/*public interface UserMapper {
	void saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findUserById(int id);

    List<User> findAll();
}*/
public interface UsersDao {
	public List<Users> findAll();
	
	public Users findOne(String user_uuid);
	
	public void updateOne(Users users);
	
	public void deleteOne(String user_uuid);
	
	public List<Users> findPageSize(Map<String, Object> map);
	
	public int getCount();
	
	public void addOne(Users users);
	
	public String findOrganName(String user_uuid);
	
	List<UsersPageList> getAll(UsersPageList usersPageList);
	
	int getTatlo();
}
