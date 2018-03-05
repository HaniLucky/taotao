package com.taotao.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.taotao.manager.mapper.ItemCatMapper;
import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;

@Service
public class ItemCarServiceImpl extends BaseServiceImpl<ItemCat> implements ItemCatService {

	@Override
	public List<ItemCat> queryItemCatByParentId(Long parentId) {
		ItemCat param = new ItemCat();
		param.setParentId(parentId);
		List<ItemCat> list = super.queryListByWhere(param);
		return list;
	}

	/*
	@Autowired
	private ItemCatMapper itemCatMapper;

	@Override
	public List<ItemCat> queryItemCatByPage(Integer page, Integer rows) {

		// 分页助手
		PageHelper.startPage(page, rows);
		List<ItemCat> list = this.itemCatMapper.select(null);

		return list;
	}
	*/

}
