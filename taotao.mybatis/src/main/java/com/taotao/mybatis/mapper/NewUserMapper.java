package com.taotao.mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.github.abel533.mapper.Mapper;
import com.taotao.mybatis.pojo.User;

public interface NewUserMapper extends Mapper<User>{
	
	/*
	 * 分页查询  分页传统实现
	 */
	List<User> queryUserByPage(Map<String, Integer> param);

}
