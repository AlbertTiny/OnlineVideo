package com.boot.zhiyi.service;

import java.util.List;

import com.boot.zhiyi.Po.CityPo;
import com.boot.zhiyi.Po.TecentPo;
import com.boot.zhiyi.Po.Youtube;

public interface TecentService {
	public void addTecent(TecentPo TecentPo);
	public Boolean judgeTectnetByName(String name);//通过视频名判断视频是否存在
	public List<TecentPo> getTecent();//获取所有的视频
	public List<TecentPo> getTecentByName(String name);//通过名字获取所有的视频
}
