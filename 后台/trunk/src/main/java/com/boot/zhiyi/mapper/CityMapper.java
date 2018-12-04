package com.boot.zhiyi.mapper;

import java.util.List;

import com.boot.zhiyi.Po.CityPo;

public interface CityMapper {
	public List<CityPo> getCityInfoByName(String city_name);
}
