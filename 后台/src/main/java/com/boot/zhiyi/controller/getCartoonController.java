package com.boot.zhiyi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.zhiyi.Po.CartoonPo;
import com.boot.zhiyi.service.CartoonService;


@Controller
public class getCartoonController {
	@Autowired
	CartoonService CartoonService;
	@ResponseBody
	@RequestMapping(value="/getcartoon",method=RequestMethod.GET)
	public Map<String, Object> getcartoon(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		
		List<CartoonPo>lCartoonPos=CartoonService.getCartons();
		map.put("cartoons", lCartoonPos);
		return map;
	}
}

