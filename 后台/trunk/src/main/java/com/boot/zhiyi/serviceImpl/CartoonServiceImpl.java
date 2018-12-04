package com.boot.zhiyi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.zhiyi.Po.CartoonPo;
import com.boot.zhiyi.mapper.CartoonMapper;
import com.boot.zhiyi.service.CartoonService;

@Service
public class CartoonServiceImpl implements CartoonService {
	@Autowired
	CartoonMapper CartoonMapper;
	@Override
	public List<CartoonPo> getCartons() {
		// TODO Auto-generated method stub
		return CartoonMapper.getCartons();
	}

}
