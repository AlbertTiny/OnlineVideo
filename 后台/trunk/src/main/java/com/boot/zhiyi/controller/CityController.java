package com.boot.zhiyi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.zhiyi.Po.CityPo;
import com.boot.zhiyi.Po.Student;
import com.boot.zhiyi.service.CityService;
import com.boot.zhiyi.serviceImpl.CityServiceImpl;

@Controller
public class CityController {
	@Autowired
	CityService cs;
	@ResponseBody
	@RequestMapping(value="/CityInfo",method=RequestMethod.GET)
	public Map<String, Object> CityInfo(@RequestParam(value = "city_name") String city_name,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String,Object>map=new HashMap<String, Object> ();
		List<CityPo> lCityPos=cs.getCityInfo(city_name);
		map.put("City", lCityPos);
		return map;
	}
}
