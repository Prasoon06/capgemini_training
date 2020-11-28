package com.codegram.ppm.dao;

import java.util.List;

import com.codegram.ppm.domain.Project;

public interface ProjectDAO {
	public void save(Project project);
	public List<Project> findAll();

}
