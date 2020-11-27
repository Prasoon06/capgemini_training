package com.cg.springxmlbaseddemo.service;

import java.util.List;

import com.cg.springxmlbaseddemo.domain.Project;

public interface ProjectService {
	
	public void createProject(Project project);
	public List<Project> getAllProjects();
	

}
