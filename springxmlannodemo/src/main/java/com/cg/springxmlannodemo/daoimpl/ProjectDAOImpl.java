package com.cg.springxmlannodemo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springxmlannodemo.dao.ProjectDAO;
import com.cg.springxmlannodemo.domain.Project;
@Repository
public class ProjectDAOImpl implements ProjectDAO {

	private List<Project> projectRepository;

	public ProjectDAOImpl() {
		
		projectRepository = new ArrayList<>();
	}

	@Override
	public void save(Project project) {
		projectRepository.add(project);

	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return projectRepository;
	}

	@Override
	public void delete(Project project) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Project project) {
		// TODO Auto-generated method stub

	}

}
