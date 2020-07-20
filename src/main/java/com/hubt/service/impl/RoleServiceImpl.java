package com.hubt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hubt.mapper.RoleMapper;
import com.hubt.model.Role;
import com.hubt.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

   @Autowired
   private RoleMapper roleMapper;

@Override
public int saveRole(Role role) {
	return roleMapper.saveRole(role);
}

@Override
public Role selectRoleByRole_name(String role_name) {
	// TODO Auto-generated method stub
	System.out.println("Servcie Role Connecting!!!");
	return roleMapper.selectRoleByRole_name(role_name);
}

@Override
public List<Role> getRoles(int begin, int end) {
	return roleMapper.getRoles(begin,end);
}

@Override
public int removeRoleByUUID(String dataId) {
	return roleMapper.removeRoleByUUID(dataId);
}

@Override
public Role getRoleByUUID(String uuid) {
	return roleMapper.getRoleByUUID(uuid);
}

@Override
public int updateRole(Role role) {
	return roleMapper.updateRole(role);
}

@Override
public Role selectRoleByRole_uuid(String role_uuid) {
	// TODO Auto-generated method stub
	return roleMapper.selectRoleByRole_uuid(role_uuid);
}

@Override
public int getRoleCount() {
	// TODO Auto-generated method stub
	return roleMapper.getRoleCount();
}
   
}
