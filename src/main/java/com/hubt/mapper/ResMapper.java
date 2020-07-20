package com.hubt.mapper;

import java.util.List;

import com.hubt.model.Res;


public interface ResMapper {
	List<String> findResIdByUrl(String url);

	boolean insertRes(Res res);
	
    boolean updateRes(Res res);

    boolean deleteRes(String id);

    Res findResById(String id);
    
    List<Res> findAllByParentId(String pid);
    
    List<Res> findAll(Integer pageNumber, Integer pageSize);
    
    int countAll();
}
