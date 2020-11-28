package com.codegram.ppm.service;

import java.util.List;

import com.codegram.ppm.domain.Project;

public interface ProjectService {
	
	public void createProject(Project project);
	public List<Project> getAllProjects();

}
