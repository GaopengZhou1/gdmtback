package com.hubt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hubt.mapper.ResMapper;
import com.hubt.model.Res;
import com.hubt.service.ResService;

@Service
public class ResServiceImpl implements ResService {

	@Autowired
	private ResMapper resMapper;
	
	public void setResMapper(ResMapper resMapper) {
		this.resMapper = resMapper;
	}
	
	@Override
	public void saveRes(Res res) {
		// TODO Auto-generated method stub
		resMapper.saveRes(res);
	}

	@Override
	public boolean updateRes(Res res) {
		// TODO Auto-generated method stub
		return resMapper.updateRes(res);
	}

	@Override
	public boolean deleteRes(String id) {
		// TODO Auto-generated method stub
		return resMapper.deleteRes(id);
	}

	@Override
	public Res findResById(String id) {
		// TODO Auto-generated method stub
		return resMapper.findResById(id);
	}

	@Override
	public List<Res> findAllByParentId(String pid) {
		// TODO Auto-generated method stub
		return resMapper.findAllByParentId(pid);
	}
	
	@Override
	public List<Res> findAll(Integer pageNumber, Integer pageSize) {
		// TODO Auto-generated method stub
		return resMapper.findAll((pageNumber-1)*pageSize, pageSize);
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return resMapper.countAll();
	}
	
}
