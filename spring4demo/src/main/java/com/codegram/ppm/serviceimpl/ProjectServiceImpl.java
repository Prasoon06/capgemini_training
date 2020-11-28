package com.codegram.ppm.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegram.ppm.dao.ProjectDAO;
import com.codegram.ppm.domain.Project;
import com.codegram.ppm.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDAO projectDAO;
	

	@Override
	public void createProject(Project project) {
		projectDAO.save(project);

	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectDAO.findAll();
	}

}
