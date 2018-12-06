package com.boot.zhiyi.service;

import java.util.List;

import com.boot.zhiyi.Po.CityPo;

public interface CityService {
	public List<CityPo> getCityInfo(String city_name);
}
