package com.taotao.manager.service;

import com.taotao.manager.pojo.Item;

public interface ItemService extends BaseService<Item>{
	
	/**
	 * 保存商品
	 */
	public void saveItem(Item item,String desc);

}
