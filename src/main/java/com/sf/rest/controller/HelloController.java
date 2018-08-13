package com.sf.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	/**
	 * 拦截hello请求返回到/WEB-INF/jsp/success.jsp
	 *	@ReturnType	String 
	 *	@Date	2018年8月9日	下午3:08:52
	 *  @Param  @return
	 */
	@RequestMapping(value = "/hello/{name}")
	public String hello(@PathVariable(name="name", required=false) String name){
		System.out.println("姓名：" + name);
		return "success";
	}
	
	
	@RequestMapping(value = "/world", produces = {"text/html;charset=UTF-8"})
	@ResponseBody
	public String world(){
		return "你好啊！";
	}
}
