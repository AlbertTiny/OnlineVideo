package com.boot.zhiyi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.zhiyi.Po.CartoonPo;
import com.boot.zhiyi.Po.TecentPo;
import com.boot.zhiyi.Po.Youtube;
import com.boot.zhiyi.mapper.CartoonMapper;
import com.boot.zhiyi.mapper.TecentMapper;
import com.boot.zhiyi.mapper.YoutubeMapper;
import com.boot.zhiyi.service.CartoonService;
import com.boot.zhiyi.service.TecentService;
import com.boot.zhiyi.service.YouTubeService;

@Service
public class TecentServiceImpl implements TecentService {
	@Autowired
	TecentMapper TecentMapper;

	@Override
	public void addTecent(TecentPo TecentPo) {
		// TODO Auto-generated method stub
		TecentMapper.addTecent(TecentPo);
	}
	/**
	 * 视频存在，返回false;
	 * 不存在返回true
	 */
	@Override
	public Boolean judgeTectnetByName(String name) {
		// TODO Auto-generated method stub
		Boolean re=true;
		List<TecentPo> lPos=TecentMapper.judgeTectnetByName(name);
		if(lPos.size()>=1) {
			re=false;
		}else {
			re=true;
		}
		return re;
		
		
	}
	@Override
	public List<TecentPo> getTecent() {
		// TODO Auto-generated method stub
		return TecentMapper.getTecent();
	}
	@Override
	public List<TecentPo> getTecentByName(String name) {
		// TODO Auto-generated method stub
		return TecentMapper.judgeTectnetByName(name);
	}
	

}
