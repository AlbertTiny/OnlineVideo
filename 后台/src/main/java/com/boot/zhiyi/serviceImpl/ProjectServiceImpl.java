package com.boot.zhiyi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.zhiyi.Po.CityPo;
import com.boot.zhiyi.Po.ProjectPo;
import com.boot.zhiyi.mapper.CityMapper;
import com.boot.zhiyi.mapper.ProjectMapper;
import com.boot.zhiyi.service.CityService;
import com.boot.zhiyi.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectMapper ProjectMapper;
	@Override
	public List<ProjectPo> getProjects() {
		// TODO Auto-generated method stub
		return ProjectMapper.getAdversize();
	}
	@Override
	public List<ProjectPo> getMovies() {
		// TODO Auto-generated method stub
		return ProjectMapper.getMovies();
	}
	@Override
	public List<ProjectPo> getmusic() {
		// TODO Auto-generated method stub
		return ProjectMapper.getmusic();
	}
	

}
