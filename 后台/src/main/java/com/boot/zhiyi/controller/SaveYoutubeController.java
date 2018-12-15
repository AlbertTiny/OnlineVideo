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
import com.boot.zhiyi.Po.Youtube;
import com.boot.zhiyi.service.EnglishService;
import com.boot.zhiyi.service.YouTubeService;



@Controller
public class SaveYoutubeController {
	@Autowired
	YouTubeService YouTubeService;
	@ResponseBody
	@RequestMapping(value="/saveYoutube",method=RequestMethod.GET)
	public Map<String, Object> saveYoutube(HttpServletResponse response) throws IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		Document doc;
		doc = (Document) Jsoup.connect("http://www.youku.com/").get();
		Elements links = doc.select("a[href]");  
		List<String> list=new ArrayList<String>();
		int count=0;
		for (Element link : links) {  
			String url="http:"+link.attr("href");
			String name=link.text();
			String re=url.substring(url.length()-4);
			if(re.equals("html")&&name!=null&&!name.equals("")) {
				if(YouTubeService.getYoutubeByName(name)) {
					Youtube youtube=new Youtube(name, url);
					YouTubeService.addYoutube(youtube);
					count++;
				}
				System.out.println("title:"+name+"--------link : " + url);  
			}
			
		}
		map.put("insertNumber", count);
		return map;
	}
}

