package com.boot.zhiyi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.zhiyi.Po.GunsPo;
import com.boot.zhiyi.mapper.GunsMapper;
import com.boot.zhiyi.service.GunsService;


@Service
public class GunsServiceImpl implements GunsService {
	@Autowired
	GunsMapper GusMapper;
	@Override
	public List<GunsPo> getGuns() {
		// TODO Auto-generated method stub
		return GusMapper.getGuns();
	}
	

}
