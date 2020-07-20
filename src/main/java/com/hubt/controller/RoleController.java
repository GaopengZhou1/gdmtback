package com.hubt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hubt.common.PageBean1;
import com.hubt.model.Role;
import com.hubt.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
    private RoleService roleService;
	
	
	@RequestMapping("/insert")		//增加用户
	@ResponseBody
	public int insert(@ModelAttribute Role role) 
	{
		String role_uuid = UUID.randomUUID().toString();
		role.setRole_uuid(role_uuid);
		int i=roleService.saveRole(role);
		System.out.println(i);
		return i;
		
	}
	@RequestMapping("/getRoles")	//用户分页查询
	@ResponseBody
	public PageBean1<Role> getRoles(int pageSize,int pageNumber)
	{
		System.out.println("pageSize:"+pageSize+" pageNumber:"+pageNumber);
		List<Role> roles = new ArrayList<Role>();
		int begin = (pageNumber-1)*pageSize;
		int end = pageNumber*pageSize;
		roles = roleService.getRoles(begin,end);
		int count = roleService.getRoleCount();
		PageBean1<Role> roleBean= new PageBean1<Role>();
		roleBean.setRows(roles);
		roleBean.setTotal(count);
		return roleBean;
	}
	
	@RequestMapping("/remove")		//删除用户
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
	
	@RequestMapping("/update")		//修改用户
	@ResponseBody
	public int update(Role role)
	{
		return roleService.updateRole(role);
	}
}
