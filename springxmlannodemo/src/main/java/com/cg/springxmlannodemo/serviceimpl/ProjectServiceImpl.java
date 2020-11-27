package com.cg.springxmlannodemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springxmlannodemo.dao.ProjectDAO;
import com.cg.springxmlannodemo.domain.Project;
import com.cg.springxmlannodemo.service.ProjectService;
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

		return projectDAO.findAll();
	}

}
