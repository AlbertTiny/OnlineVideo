package com.boot.zhiyi.mapper;

import java.util.List;

import com.boot.zhiyi.Po.CityPo;
import com.boot.zhiyi.Po.TecentPo;
import com.boot.zhiyi.Po.Youtube;

public interface TecentMapper {
	
	public void addTecent(TecentPo TecentPo);
	public List<TecentPo> judgeTectnetByName(String name);//通过视频名判断视频是否存在
	public List<TecentPo> getTecent();//获取所有的视频
}
