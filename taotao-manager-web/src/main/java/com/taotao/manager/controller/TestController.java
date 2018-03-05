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
	
	/**
	 * 测试程序是否可用,连接数据库是否可用
	 * URL:http://127.0.0.1:8080/rest/test/date
	 * @return
	 */
	@RequestMapping("date")
	@ResponseBody
	public String queryDate(){
		System.err.println("请求进来了...");
		return this.TestService.queryDate();
	}
	
	

}
