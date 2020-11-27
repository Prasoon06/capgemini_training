package com.cg.springxmlbaseddemo.serviceimpl;

import java.util.List;

import com.cg.springxmlbaseddemo.dao.ProjectDAO;
import com.cg.springxmlbaseddemo.daoimpl.ProjectDAOImpl;
import com.cg.springxmlbaseddemo.domain.Project;
import com.cg.springxmlbaseddemo.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {

	private ProjectDAO projectDAO;

//	public ProjectServiceImpl(ProjectDAO projectDAO) {
//		this.projectDAO=projectDAO;// DI---> Loose Coupling	
//	}
	
	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	@Override
	public void createProject(Project project) {
		projectDAO.save(project);

	}

	@Override
	public List<Project> getAllProjects() {

		return projectDAO.findAll();
	}

}
