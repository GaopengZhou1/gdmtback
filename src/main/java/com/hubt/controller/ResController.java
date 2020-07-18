package com.hubt.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hubt.model.Node;
import com.hubt.model.Res;
import com.hubt.model.UsersJasonResult;
import com.hubt.service.ResService;

@Controller
@RequestMapping("/res")
public class ResController {

	@Autowired
	private ResService resService;

	public void setResService(ResService resService) {
		this.resService = resService;
	}

	@RequestMapping("/insert")
	public boolean insertRes(@Param("form")Res res) {
//		System.out.println(res);
		return resService.insertRes(res);
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public boolean updateRes(@Param("form")Res res) {
//		System.out.println(res);
		return resService.updateRes(res);
	}

	@ResponseBody
	@RequestMapping("/remove")
	public boolean removeRes(@Param("id")String id) {
//		System.out.println(id);
		return resService.deleteRes(id);
	}

	@ResponseBody
	@RequestMapping("/getResource")
	public Res getResource(@Param("uuid")String uuid) {
//		System.out.println(uuid);
		return resService.findResById(uuid);
	}
	
	@ResponseBody
	@RequestMapping("/getResourcesByParentId")
	public Node getResByPid(@Param("parentId") String parentId) {
		Node rt = new Node();
		rt.setId(parentId);
		if(parentId.equals("root"))
			rt.setName("root");
		else
			rt.setName(resService.findResById(parentId).getDir_name());
		
		Queue<Node> que = new LinkedList<Node>();
		que.add(rt);
		while(!que.isEmpty()) {
			Node hd = que.poll();
			List<Res> list = resService.findAllByParentId(hd.getId());
			List<Node> children = new ArrayList<Node>();
			for(Res r : list) {
				Node t = new Node(r.getMenu_id(), r.getDir_name(), null);
				children.add(t);
				que.add(t);
			}
			hd.setChildren(children);
			if(children.size() > 0)
				hd.setHasChildren(true);
		}
		return rt;
	}

	@ResponseBody
	@RequestMapping("/getResources")
	public UsersJasonResult<Res> getRes(@Param("pageSize") Integer pageSize, @Param("pageNumber") Integer pageNumber) {
		System.out.println(pageSize + ", " + pageNumber);
		UsersJasonResult<Res> list = new UsersJasonResult<Res>();
		list.setRows(resService.findAll(pageNumber, pageSize));
		list.setTotal(resService.countAll());
		return list;
	}
	   
}
