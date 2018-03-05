package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
	
	/**
	 * 通用的页面跳转controller
	 * @param pageName 要跳转的页面
	 * @return
	 */
	// 127.0.0.1:8080/rest/page/index   跳转到首页
	@RequestMapping("{pageName}")
	public String toPage(@PathVariable("pageName") String pageName){
		return pageName;
		
	}
}
