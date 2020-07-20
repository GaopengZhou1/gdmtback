package com.hubt.service;

import java.util.List;

import com.hubt.model.Role;

public interface RoleService {

	int saveRole(Role role);

	Role selectRoleByRole_name(String role_name);

	List<Role> getRoles();

	int removeRoleByUUID(String dataId);

	Role getRoleByUUID(String uuid);

	int updateRole(Role role);

}