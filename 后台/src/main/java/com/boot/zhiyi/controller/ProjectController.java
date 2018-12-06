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

import com.boot.zhiyi.Po.ProjectPo;



@Controller
public class ProjectController {
	@Autowired
	com.boot.zhiyi.service.ProjectService ProjectService;
	@ResponseBody
	@RequestMapping(value="/getadversize",method=RequestMethod.GET)
	public Map<String, Object> getadversize(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		List<ProjectPo>lCartoonPos=ProjectService.getProjects();
		map.put("cartoons", lCartoonPos);
		return map;
	}
	@ResponseBody
	@RequestMapping(value="/getMovies",method=RequestMethod.GET)
	public Map<String, Object> getMovies(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		List<ProjectPo>lCartoonPos=ProjectService.getMovies();
		map.put("cartoons", lCartoonPos);
		return map;
	}
	@ResponseBody
	@RequestMapping(value="/getmusic",method=RequestMethod.GET)
	public Map<String, Object> getmusic(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		List<ProjectPo>lCartoonPos=ProjectService.getmusic();
		map.put("cartoons", lCartoonPos);
		return map;
	}
}

