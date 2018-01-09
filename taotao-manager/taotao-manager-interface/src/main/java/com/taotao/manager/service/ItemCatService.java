package com.taotao.manager.service;

import java.util.List;

import com.taotao.manager.pojo.ItemCat;

public interface ItemCatService {
	

	/**
	 * 分页助手
	 * @param page  从第几页开始
	 * @param rows	展示几条记录
	 * @return
	 */
	List<ItemCat> queryItemCatByPage(Integer page ,Integer rows);
}
