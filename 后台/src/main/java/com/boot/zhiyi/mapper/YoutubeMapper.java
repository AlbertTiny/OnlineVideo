package com.boot.zhiyi.mapper;

import java.util.List;

import com.boot.zhiyi.Po.CityPo;
import com.boot.zhiyi.Po.Youtube;

public interface YoutubeMapper {
	public List<Youtube> getYoutube();//获取所有的youtube内容
	public void addYoutube(Youtube youtube);
	public List<Youtube> getYoutubeByName(String name);
	public List<Youtube> getYoutubeLikeName(String name);//模糊匹配名字获取所有的youtube内容
}
