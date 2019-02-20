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
import com.boot.zhiyi.Po.Youtube;
import com.boot.zhiyi.service.EnglishService;
import com.boot.zhiyi.service.YouTubeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



@Controller
public class getYoutubeController {
	@Autowired
	 YouTubeService YouTubeService;
	@ResponseBody
	@RequestMapping(value="/getYoutube",method=RequestMethod.GET)
	public Map<String, Object> getYoutube(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		// 表示从第pn查，每一页显示5条数据
		PageHelper.startPage(pn, 10);// 后面紧跟的这个查询就是分页查询
		List<Youtube>lYoutubes= YouTubeService.getYoutube();
		PageInfo page = new PageInfo(lYoutubes, 5);// 5:表示每次只显示5页的导航菜单
		map.put("cartoons",page);
		return map;
	}
	@ResponseBody
	@RequestMapping(value="/getYoutubeByName",method=RequestMethod.GET)
	public Map<String, Object> getYoutubeByName(@RequestParam(value = "name") String name,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		List<Youtube>lYoutubes=YouTubeService.getYoutubeLikeName(name);
		map.put("cartoons",lYoutubes);
		return map;
	}
}

