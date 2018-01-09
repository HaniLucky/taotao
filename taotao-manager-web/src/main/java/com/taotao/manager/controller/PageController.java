package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
	// 127.0.0.1:8080/rest/page/index
	@RequestMapping("{pageName}")
	public String toPage(@PathVariable("pageName") String pageName){
		return pageName;
		
	}
}
