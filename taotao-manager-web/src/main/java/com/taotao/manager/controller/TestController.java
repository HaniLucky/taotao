package com.taotao.manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.service.TestService;

@Controller
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private TestService TestService;
	
	@RequestMapping("date")
	@ResponseBody
	public String queryDate(){
		System.err.println("请求进来了...");
		return this.TestService.queryDate();
	}
	
	@RequestMapping("t")
	public void t(){
		System.err.println("请求进来了");
	}

}
