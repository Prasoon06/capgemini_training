package com.cg.springxmlannodemo.service;

import java.util.List;

import com.cg.springxmlannodemo.domain.Project;

public interface ProjectService {
	
	public void createProject(Project project);
	public List<Project> getAllProjects();
	

}
