package com.hubt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hubt.model.Role;

public interface RoleMapper {

	int saveRole(Role role);

	Role selectRoleByRole_name(String role_name);

	List<Role> getRoles();

	int removeRoleByUUID(String dataId);

	Role getRoleByUUID(String uuid);

	int updateRole(Role role);

}