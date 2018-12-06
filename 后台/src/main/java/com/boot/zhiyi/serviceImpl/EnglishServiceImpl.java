package com.boot.zhiyi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.zhiyi.Po.EnglishPo;
import com.boot.zhiyi.service.EnglishService;
;

@Service
public class EnglishServiceImpl implements EnglishService {
	@Autowired
	com.boot.zhiyi.mapper.EnglishMapper EnglishMapper;
	@Override
	public List<EnglishPo> getEnglish() {
		// TODO Auto-generated method stub
		return EnglishMapper.getEnglish();
	}

}
