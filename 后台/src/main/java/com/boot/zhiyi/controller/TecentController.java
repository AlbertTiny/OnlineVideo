package com.boot.zhiyi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.zhiyi.Po.EnglishPo;
import com.boot.zhiyi.Po.TecentPo;
import com.boot.zhiyi.Po.Youtube;
import com.boot.zhiyi.service.EnglishService;
import com.boot.zhiyi.service.TecentService;
import com.boot.zhiyi.service.YouTubeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



@Controller
public class TecentController {
	@Autowired
	 TecentService TecentService;
	@ResponseBody
	@RequestMapping(value="/saveTecent",method=RequestMethod.GET)
	public Map<String, Object> saveTecent(HttpServletResponse response) throws IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		Document doc;
		doc = (Document) Jsoup.connect("https://v.qq.com/").get();
		Elements links = doc.select("a[href]");  
		List<String> list=new ArrayList<String>();
		int count=0;
		for (Element link : links) {  
			String url=link.attr("href");
			String name=link.text();
			String re="txt";
			if(url.length()>=4) {
				re=url.substring(url.length()-4);
			}
			 
			if(re.equals("html")&&name!=null&&!name.equals("")) {
				if(TecentService.judgeTectnetByName(name)) {//如果视频不存在
					TecentPo tecentPo=new TecentPo(name,url);
					TecentService.addTecent(tecentPo);
					count++;
					System.out.println("title:"+name+"--------link : " + url);  
				}
				
			}
			
		}
		map.put("insertNumber", count);
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping(value="/getTecent",method=RequestMethod.GET)
	public Map<String, Object> getTecent(@RequestParam(value="pn",defaultValue="1") Integer pn,HttpServletResponse response) throws IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		// 表示从第pn查，每一页显示5条数据
		PageHelper.startPage(pn, 10);// 后面紧跟的这个查询就是分页查询
		List<TecentPo>lYoutubes= TecentService.getTecent();
		PageInfo page = new PageInfo(lYoutubes, 5);// 5:表示每次只显示5页的导航菜单
		map.put("cartoons",page);
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping(value="/getTecentByName",method=RequestMethod.GET)
	public Map<String, Object> getTecentByName(@RequestParam(value = "name") String name,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		List<TecentPo>lYoutubes=TecentService.getTecentByName(name);
		map.put("cartoons",lYoutubes);
		return map;
	}
}

