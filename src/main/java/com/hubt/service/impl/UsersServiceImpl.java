package com.hubt.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hubt.common.PageBean;
import com.hubt.mapper.UsersDao;
import com.hubt.model.Users;
import com.hubt.model.UsersPageList;
import com.hubt.service.UsersService;


@Service(value = "usersService")
@Transactional
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	UsersDao usersDao;

	public List<Users> getUsers() {
		return usersDao.findAll();
		
	}

	public Users getUserById(String user_uuid) {
		return usersDao.findOne(user_uuid);
	}

	public void updateUser(Users users) {
		// 修改之前先查询，再整合赋值ֵ
		Users old = usersDao.findOne(users.getUser_uuid());
		BeanUtils.copyProperties(users, old);
		usersDao.updateOne(old);
	}

	/**
	 * 分页查询产品
	 */
	public PageBean<Users> findPageUsers(int curPage, int pageSize) {
		PageBean<Users> pageBean = new PageBean<Users>();
		pageBean.setPage(curPage);
		pageBean.setPageSize(pageSize);
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("startIndex", (curPage - 1) * pageSize);
		hashMap.put("pageSize", pageSize);
		List<Users> items = usersDao.findPageSize(hashMap);
		pageBean.setList(items);
		int count = usersDao.getCount();
		pageBean.setTotalCount(count);
		// 一共多少页
		int totalPage = pageBean.getTotalCount() % pageBean.getPageSize()==0 ? pageBean.getTotalCount()/pageBean.getPageSize():pageBean.getTotalCount()/pageBean.getPageSize()+1;
		pageBean.setTotalPage(totalPage);
		return pageBean;
	}

	public void addUser(Users users) {
		// TODO Auto-generated method stub
		usersDao.addOne(users);
	}

	public void deleteUser(String user_uuid) {
		// TODO Auto-generated method stub
		usersDao.deleteOne(user_uuid);
	}

	public String findOrganName(String user_uuid) {
		// TODO Auto-generated method stub
		return usersDao.findOrganName(user_uuid);
	}

	@Override
	public int getTatlo() {
		// TODO Auto-generated method stub
		return usersDao.getTatlo();
	}

	@Override
	public List<UsersPageList> getAll(UsersPageList usersPageList) {
		// TODO Auto-generated method stub
		return usersDao.getAll(usersPageList);
	}



}
