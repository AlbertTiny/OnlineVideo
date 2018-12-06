package com.boot.zhiyi.service;

import java.util.List;

import com.boot.zhiyi.Po.CartoonPo;
import com.boot.zhiyi.Po.ProjectPo;


public interface ProjectService {
	public List<ProjectPo> getProjects();
	public List<ProjectPo> getMovies();
	public List<ProjectPo> getmusic();
}
