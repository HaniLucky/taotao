package com.taotao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.manager.pojo.Item;
import com.taotao.manager.pojo.ItemDesc;
import com.taotao.manager.service.ItemDescService;
import com.taotao.manager.service.ItemService;

@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService{

	@Autowired
	private ItemDescService itemDescService;
	@Override
	public void saveItem(Item item,String desc) {
			// 保存item
			item.setStatus(1); // 设置状态
			this.save(item);
			
			// 保存desc
			ItemDesc itemDesc = new ItemDesc();
			itemDesc.setItemId(item.getId());
			itemDesc.setItemDesc(desc);
			itemDescService.save(itemDesc);
	}

}
