package com.taotao.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;

/**
 * 注解说明:
 * 
 * @PathVariable PathVariable是用来对指定请求的URL路径里面的变量 {page}
 * @RequestParam get请求参数
 * @ResponseBody 以json字符串返回
 *
 */
@Controller
@RequestMapping("item/cat")
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;

	// http://127.0.0.1:8080/rest/item/cat/query/1?rows=2
	@RequestMapping("query/{page}")
	@ResponseBody
	public List<ItemCat> queryItemCatByPage(@PathVariable("page") Integer page, @RequestParam("rows") Integer rows) {
		List<ItemCat> list = itemCatService.queryItemCatByPage(page, rows);
		return list;
	}
}
