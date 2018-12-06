package com.boot.zhiyi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.zhiyi.Po.CityPo;
import com.boot.zhiyi.mapper.CityMapper;
import com.boot.zhiyi.service.CityService;
@Service
public class CityServiceImpl implements CityService {
	@Autowired
	CityMapper CityMapper;
	@Override
	public List<CityPo> getCityInfo(String city_name) {
		// TODO Auto-generated method stub
		return CityMapper.getCityInfoByName(city_name);
	}

}
