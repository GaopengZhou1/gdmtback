package com.hubt.controller;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hubt.common.PageBean;
import com.hubt.model.Users;
import com.hubt.model.UsersJasonResult;
import com.hubt.model.UsersPageList;
import com.hubt.service.UsersService;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersService usersService;  
    
	
    @RequestMapping("/getUsers")
    @ResponseBody
    public UsersJasonResult<UsersPageList> getAll(UsersPageList usersPageList){
    	UsersJasonResult<UsersPageList> up = new UsersJasonResult<UsersPageList>();
        //得到总页数
        int totle = usersService.getTatlo();
        up.setTotal(totle);
        //得到user数据对象
        List<UsersPageList> plist = usersService.getAll(usersPageList);
        up.setRows(plist);
        return  up;
    }
    
    @ResponseBody
    @RequestMapping("/getUser")
    public Users getOneUser(@Param("uuid") String uuid) {
    	//System.out.println(uuid);
    	return usersService.getUserById(uuid);
    }
    
    @ResponseBody
    @RequestMapping("/update")
    public Integer updateUsers(@Param("form") Users form) {
    	System.out.println(form);
    	Users users = form;
    	usersService.updateUser(users);
    	return 1;
    }
    
    @ResponseBody
    @RequestMapping("/remove")
    public Integer deleteUsers(@Param("id") String id) {
    	System.out.println(id);
    	usersService.deleteUser(id);
    	return 1;
    }
    @ResponseBody
    @RequestMapping("/insert")
    public Integer insertUsers(@Param("form") Users form) {
    	Users users = form;
    	users.setUser_uuid(UUID.randomUUID().toString());
    	usersService.addUser(users);
    	return 1;
    }
    
    @RequestMapping("/getUsers/{page}/{pageSize}")
	public String pageList(@PathVariable("page") int page,@PathVariable("pageSize") int pageSize,ModelMap modelMap) {
		//查询当前页的数据
		PageBean<Users> pageBean = usersService.findPageUsers(page==0?1:page, pageSize==0?3:pageSize);
		modelMap.addAttribute("pageBean", pageBean);
		return "userList";
	}
    
    @RequestMapping(value = "/getSelections/{user_uuid}")
	public Users getSelections(@PathVariable("user_uuid") String user_uuid, ModelMap modelMap) throws Exception {
		Users user = usersService.getUserById(user_uuid);
		modelMap.addAttribute("user", user);
		// 接收请求参数
		return user;
	}
}
