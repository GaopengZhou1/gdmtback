package com.hubt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hubt.model.Role;

public interface RoleMapper {

	int saveRole(Role role);

	Role selectRoleByRole_name(String role_name);

	List<Role> getRoles(@Param("begin")int begin, @Param("end")int end);

	int removeRoleByUUID(String dataId);

	Role getRoleByUUID(String uuid);

	int updateRole(Role role);

	Role selectRoleByRole_uuid(String role_uuid);

	int getRoleCount();

}
