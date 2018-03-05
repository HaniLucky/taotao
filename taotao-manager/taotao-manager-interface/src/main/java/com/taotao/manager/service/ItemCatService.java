package com.taotao.manager.service;

import java.util.List;

import com.taotao.manager.pojo.ItemCat;

public interface ItemCatService extends BaseService<ItemCat>{

	/**
	 * 类目查询
	 * @param parentId
	 * @return
	 */
	List<ItemCat> queryItemCatByParentId(Long parentId);
	

	/**
	 * 分页助手
	 * @param page  从第几页开始
	 * @param rows	展示几条记录
	 * @return
	 */
	// List<ItemCat> queryItemCatByPage(Integer page ,Integer rows);
}
