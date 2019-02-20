package com.boot.zhiyi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.zhiyi.Po.CartoonPo;
import com.boot.zhiyi.Po.Youtube;
import com.boot.zhiyi.mapper.CartoonMapper;
import com.boot.zhiyi.mapper.YoutubeMapper;
import com.boot.zhiyi.service.CartoonService;
import com.boot.zhiyi.service.YouTubeService;

@Service
public class YoutubeServiceImpl implements YouTubeService {
	@Autowired
	YoutubeMapper YoutubeMapper;
	@Override
	public Boolean getYoutubeByName(String name) {
		// TODO Auto-generated method stub
		Boolean re=true;
		 if(YoutubeMapper.getYoutubeByName(name).size()>=1) {
			 re=false;
		 }else {
			 re=true;
		 }
		 return re;
	}
	@Override
	public void addYoutube(Youtube youtube) {
		// TODO Auto-generated method stub
		YoutubeMapper.addYoutube(youtube);
	}
	@Override
	public List<Youtube> getYoutube() {
		// TODO Auto-generated method stub
		return YoutubeMapper.getYoutube();
	}
	@Override
	public List<Youtube> getYoutubeLikeName(String name) {
		// TODO Auto-generated method stub
		return YoutubeMapper.getYoutubeLikeName(name);
	}
	

}
