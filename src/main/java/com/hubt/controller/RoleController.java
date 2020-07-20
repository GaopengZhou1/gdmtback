package com.hubt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hubt.model.Role;
import com.hubt.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
    private RoleService roleService;
	
	
	@RequestMapping("/insert")
	@ResponseBody
	public int insert(@ModelAttribute Role role) 
	{
		//String role_id = httpServletRequest.getParameter("role_id");
		//String role_name = httpServletRequest.getParameter("role_name");
		String role_uuid = UUID.randomUUID().toString();
		//Role role= new Role(role_uuid, role_id, role_name);
		role.setRole_uuid(role_uuid);
		int i=roleService.saveRole(role);
		System.out.println(i);
		return i;
		
	}
	@RequestMapping("/getRoles")
	@ResponseBody
	public List<Role> getRoles()
	{
		List<Role> roles = new ArrayList<Role>();
		roles = roleService.getRoles();
		return roles;
	}
	@RequestMapping("/remove")
	@ResponseBody
	public int remove(String id) {
		int i = roleService.removeRoleByUUID(id);
		return i;
	}
	// getRole 在点击修改按钮后 查找该Role对象，并将Role对象信息返回给前端jsp页面的text中
	@RequestMapping("/getRole")
	@ResponseBody
	public Role getRole(String uuid) {
		return roleService.getRoleByUUID(uuid);
	}
	@RequestMapping("/update")
	@ResponseBody
	public int update(Role role)
	{
		return roleService.updateRole(role);
	}
}