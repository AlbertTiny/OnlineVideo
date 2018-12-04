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

import com.boot.zhiyi.Po.EnglishPo;
import com.boot.zhiyi.Po.GunsPo;
import com.boot.zhiyi.service.GunsService;




@Controller
public class getGunsController {
	@Autowired
	GunsService GunsService; 
	@ResponseBody
	@RequestMapping(value="/getGuns",method=RequestMethod.GET)
	public Map<String, Object> getGuns(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		
		List<GunsPo>lEnglishPos=GunsService.getGuns();
		map.put("cartoons", lEnglishPos);
		return map;
	}
}

