package com.boot.zhiyi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.zhiyi.Po.Student;

@Controller
public class BootController {
	@ResponseBody
	@RequestMapping("/request")
	public String request() {
		return "请求已经获取";
	}

	@RequestMapping("/wecome")
	public String wecome(Map<String, Object> map) {
		map.put("welcome", "welcome_Thymeleaf");
		List<Student> lStudents = new ArrayList<Student>();
		lStudents.add(new Student("zx", 21));
		lStudents.add(new Student("zx1", 22));
		lStudents.add(new Student("zx3", 23));
		lStudents.add(new Student("zx4", 24));
		map.put("Students", lStudents);
		return "result";
	}

}
