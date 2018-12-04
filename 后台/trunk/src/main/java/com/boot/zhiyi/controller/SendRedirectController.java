package com.boot.zhiyi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.zhiyi.Po.Student;

@Controller
public class SendRedirectController {
	

	@RequestMapping("/forward")
	public void wecome( HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		request.setCharacterEncoding("utf-8");
		String cotent=request.getParameter("input_search");
		System.out.println("搜索内容为"+cotent);
		response.sendRedirect("https://www.baidu.com/s?wd="+cotent);
	
	}

}
